SUMMARY = "Babel support for typesetting Vietnamese"
DESCRIPTION = "The package provides the language definition file for support \
of Vietnamese in babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn39246"

RPM_NAME = "texlive-babel-vietnamese-2023.209.1.4svn39246-54.1.noarch.rpm"
RPM_HASH = "11083b9381f230f1e7ca5fbd5bed537d959257616017ba52ac987f472cc35f628246ef9bae85bfa00445be02336f7965f77f798242d3ebfcfb096e091a92d3f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vietnamese.ldf \
texlive-babel-vietnamese"

RDEPENDS:${PN} += "/usr/bin/sh \
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
