SUMMARY = "An unofficial LaTeX thesis template for ShanghaiTech University"
DESCRIPTION = "This package, forked from ucasthesis, is an unofficial LaTeX \
thesis template for ShanghaiTech University and satisfies all \
format requirements of the school. The user just needs to set \
\\documentclass{shtthesis} and to set up mandatory information \
via \\shtsetup, then his or her thesis document will be typeset \
properly."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3.3svn62441"

RPM_NAME = "texlive-shtthesis-2023.201.0.0.3.3svn62441-53.1.noarch.rpm"
RPM_HASH = "42cd7317814bff97e3d8f03779cb15c87f83c248407adaac0183677a0aaeaaf983dd466a0a23dbe6095496c410feb559e03e5101400e3bce3628165dd1f35c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shtthesis.cls \
texlive-shtthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-biblatex.sty \
tex-calc.sty \
tex-caption.sty \
tex-ctexbook.cls \
tex-datetime.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-kvdefinekeys.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-lastpage.sty \
tex-letltxmacro.sty \
tex-mathtools.sty \
tex-tocvsec2.sty \
tex-ulem.sty \
tex-unicode-math.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-alphalph \
texlive-biber \
texlive-biblatex \
texlive-biblatex-gb7714-2015 \
texlive-booktabs \
texlive-caption \
texlive-colortbl \
texlive-ctex \
texlive-datetime \
texlive-enumitem \
texlive-fancyhdr \
texlive-filesystem \
texlive-fmtcount \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lastpage \
texlive-latexmk \
texlive-listings \
texlive-lua-alt-getopt \
texlive-lualatex-math \
texlive-mathtools \
texlive-ntheorem \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-gyre \
texlive-tocvsec2 \
texlive-transparent \
texlive-undolabl \
texlive-unicode-math \
texlive-xits \
texlive-xstring"

inherit rpm
