SUMMARY = "Compiling basic math formulas in Japanese using LuaLaTeX"
DESCRIPTION = "This is a style file for compiling basic maths formulas in \
Japanese using LuaLaTeX. \\NewDocumentCommand allows you to \
specify whether the formula should be used within a sentence or \
on a new line. The main packages used in \
japanese-mathformulas.sty are amsmath, amssymb, siunitx, \
ifthen, xparse, TikZ, mathtools, and graphics."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn64678"

RPM_NAME = "texlive-japanese-mathformulas-2023.209.1.0.2svn64678-56.1.noarch.rpm"
RPM_HASH = "a0f9bc1576123f59b036ed75a1be2bb0a631ecd41d6da93ee5bd253f1de522942e017a72da75f8c13d13522ea1975ceeab71dafeefcf6c21945fa28c922029ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-japanese-mathformulas.sty \
texlive-japanese-mathformulas"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-esvect.sty \
tex-graphics.sty \
tex-ifthen.sty \
tex-luatexja-fontspec.sty \
tex-luatexja-otf.sty \
tex-luatexja.sty \
tex-mathtools.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
