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

PV = "2023.201.0.0.1.0svn65693"

RPM_NAME = "texlive-lparse-2023.201.0.0.1.0svn65693-54.1.noarch.rpm"
RPM_HASH = "d191e3bb96f544f07c4a55f6275381caab89c9c4f16008994d7ff339020d128fdb856a5f886bd75eb57f0713cc3001d540d0f504b687a02c5883e392513b47b2"
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
