SUMMARY = "Babel support for Japanese"
DESCRIPTION = "This package provides a japanese option for the babel package. \
It defines all the language definition macros in Japanese. \
Currently this package works with pLaTeX, upLaTeX, XeLaTeX and \
LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn57733"

RPM_NAME = "texlive-babel-japanese-2023.209.svn57733-54.1.noarch.rpm"
RPM_HASH = "9ba4291e0cdd353877d69ed7ee0e62633ae458b3254ecbb81e8d95558c25d9ce3343cbc9d53d95cc5e5ac45618db7ccb6238cf16e1404f5a3a429e8a2a493a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-japanese.ldf \
texlive-babel-japanese"

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
