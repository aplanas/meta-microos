SUMMARY = "Compiling basic math formulas in Japanese using LuaLaTeX"
DESCRIPTION = "This is a style file for compiling basic maths formulas in \
Japanese using LuaLaTeX. \\NewDocumentCommand allows you to \
specify whether the formula should be used within a sentence or \
on a new line. The main packages used in \
japanese-mathformulas.sty are amsmath, amssymb, siunitx, \
ifthen, xparse, TikZ, mathtools, and graphics."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn64678"

RPM_NAME = "texlive-japanese-mathformulas-2023.201.1.0.2svn64678-55.1.noarch.rpm"
RPM_HASH = "5ee97d3f3327e1f177992289ef71dafcefc9b520d70e0d7191bfebaaaaf4749be5f58b641fd5a738cd99607bf1302fcc1f6a03cfba4cce4f5f391108ebd99580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-japanese-mathformulas.sty \
texlive-japanese-mathformulas"

RDEPENDS:${PN} += "/bin/sh \
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
