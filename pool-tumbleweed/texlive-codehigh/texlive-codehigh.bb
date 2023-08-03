SUMMARY = "Highlight code and demos with l3regex and lpeg"
DESCRIPTION = "This package uses the l3regex package from the LaTeX3 \
Programming Layer to parse and highlight source code and demos. \
It is more powerful than the listings package, and more easy to \
use than minted. But it is slower than both of them. Therefore \
in LuaTeX the package provides another way to highlight code: \
using LPeg (Parsing Expression Grammars for Lua). LPeg is much \
more powerful and faster than l3regex."
LICENSE = "LPPL-1.0"

PV = "2023.209.2023asvn65787"

RPM_NAME = "texlive-codehigh-2023.209.2023asvn65787-54.1.noarch.rpm"
RPM_HASH = "59740f3da8dc0d1b6447d89ccd8a95903abce488697679b0061b65d97c147a4d7746f58a5970d2a19fcd850a487dcf0b1429f112202093683283cd1b5ea86665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codehigh.sty \
texlive-codehigh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-expl3.sty \
tex-iftex.sty \
tex-luatexbase.sty \
tex-ninecolors.sty \
tex-varwidth.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
