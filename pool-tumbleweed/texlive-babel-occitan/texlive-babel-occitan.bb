SUMMARY = "Babel support for Occitan"
DESCRIPTION = "Occitan language description file with usage instructions."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn39608"

RPM_NAME = "texlive-babel-occitan-2023.201.0.0.2svn39608-53.1.noarch.rpm"
RPM_HASH = "5ec1abc63a9770bf0d9495fe3b28adb67e109da6f34bc97cb36a41ade54f0410ba86149ec115b901ee0c5398813d36e2ae1e80f716251d200340b4b4c892e53f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-occitan.ldf \
texlive-babel-occitan"

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
