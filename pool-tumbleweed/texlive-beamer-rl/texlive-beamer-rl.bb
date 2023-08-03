SUMMARY = "Right to left presentation with beamer and babel"
DESCRIPTION = "This class provides patches of some beamer templates and \
commands for presentation from right to left. It requires Babel \
with the LuaTeX engine."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn65725"

RPM_NAME = "texlive-beamer-rl-2023.209.1.8svn65725-54.1.noarch.rpm"
RPM_HASH = "0b1d6c9df38962d910f5c0dfc678b26660bfaa936fe28ddc814f3cf7d5cc1f39a05b856967e848229422927b56c7a61d8f7e067a9958aa9b8e423986313438fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamer-rl.cls \
tex-pgfpages-rl.sty \
texlive-beamer-rl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-beamer.cls \
tex-ifluatex.sty \
tex-pgfpages.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
