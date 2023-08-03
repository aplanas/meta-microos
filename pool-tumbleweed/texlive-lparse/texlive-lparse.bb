SUMMARY = "A Lua module for parsing key-value options"
DESCRIPTION = "The name lparse is derived from xparse. The 'x' has been \
replaced by an 'l' because this package only works with LuaTeX. \
'l' stands for 'Lua'. Just as with xparse, it is possible to \
use a special syntax consisting of single letters to express \
the arguments of a macro. However, lparse is able to read \
arguments regardless of the macro systemd used -- whether \
LaTeX, or ConTeXt, or even plain TeX. Of course, LuaTeX must \
always be used as the engine."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.0svn65693"

RPM_NAME = "texlive-lparse-2023.209.0.0.1.0svn65693-55.1.noarch.rpm"
RPM_HASH = "41efd66f7d503741745beaecba64f9fb840281f3e0089fb442b0a2a46d939c2c3fe35221872829977a856b0d21f369ad0cab346265ce3164995c0757d1ca63ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lparse.sty \
tex-lparse.tex \
texlive-lparse"

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
