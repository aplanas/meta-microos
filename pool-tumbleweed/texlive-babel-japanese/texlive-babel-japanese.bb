SUMMARY = "Babel support for Japanese"
DESCRIPTION = "This package provides a japanese option for the babel package. \
It defines all the language definition macros in Japanese. \
Currently this package works with pLaTeX, upLaTeX, XeLaTeX and \
LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn57733"

RPM_NAME = "texlive-babel-japanese-2023.201.svn57733-53.1.noarch.rpm"
RPM_HASH = "c7ba7e62c2b145b6a935a34a4c188861bc406dde7dd234442d758861339deb73f7e049523efab074c9ec3e01c2e267fb78df33a137fe8066a7236bb890741437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-japanese.ldf \
texlive-babel-japanese"

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
