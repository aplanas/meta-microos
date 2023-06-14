SUMMARY = "Babel support for typesetting Swedish"
DESCRIPTION = "The package provides the language definition file for Swedish."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3esvn57647"

RPM_NAME = "texlive-babel-swedish-2023.201.2.3esvn57647-53.1.noarch.rpm"
RPM_HASH = "1c46d0e2b0e163a3a55568fe42f05e8eb8c72d450a972fe25e79562c986d1855cd78c9e1474d3aabf51429f02a66f524d338142d3c412dc7066d2627fc5e208f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-swedish.ldf \
texlive-babel-swedish"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
