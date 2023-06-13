SUMMARY = "Babel support for typesetting Vietnamese"
DESCRIPTION = "The package provides the language definition file for support \
of Vietnamese in babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn39246"

RPM_NAME = "texlive-babel-vietnamese-2023.201.1.4svn39246-53.1.noarch.rpm"
RPM_HASH = "baf9724dd2b2154a79ab6513815cbdc87ff087130dcb0bd9b9d3c373b23f61311513a409dd3b937f8926c177f630a639189a965ca964042160fadbf5bbbeb58a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(vietnamese.ldf) \
texlive-babel-vietnamese"

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
