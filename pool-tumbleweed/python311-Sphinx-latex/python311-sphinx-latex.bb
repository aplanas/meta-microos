SUMMARY = "Sphinx packages for LaTeX"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the LaTeX components for python-Sphinx."
LICENSE = "BSD-2-Clause"

PV = "7.2.5"

RPM_NAME = "python311-Sphinx-latex-7.2.5-1.1.noarch.rpm"
RPM_HASH = "bf843e3c544a2a893fd323e844fafb32a259c89c862b81849593d7fd0ce6ba988bcdba2cc41d55e3ca7eb09fc9ba6ce662f1b164e9e1954d9d11d764af97ae74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Sphinx-latex \
python311-Sphinx-latex"

RDEPENDS:${PN} += "python311-Sphinx \
tex-8r.enc \
tex-alltt.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-array.sty \
tex-article.cls \
tex-atbegshi.sty \
tex-babel.sty \
tex-bm.sty \
tex-capt-of.sty \
tex-cmap.sty \
tex-color.sty \
tex-colortbl.sty \
tex-dvipdfmx.def \
tex-english.ldf \
tex-eqparbox.sty \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-fancyvrb.sty \
tex-float.sty \
tex-fncychap.sty \
tex-fontenc.sty \
tex-footnote.sty \
tex-framed.sty \
tex-graphics.sty \
tex-graphicx.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-longtable.sty \
tex-luatex85.sty \
tex-makeidx.sty \
tex-multirow.sty \
tex-needspace.sty \
tex-newfloat.sty \
tex-palatino.sty \
tex-parskip.sty \
tex-pcrr.tfm \
tex-pdftex.def \
tex-pdftex.map \
tex-phvr.tfm \
tex-polyglossia.sty \
tex-pplr.tfm \
tex-preview.sty \
tex-ptmr.tfm \
tex-pzcmi.tfm \
tex-tabulary.sty \
tex-textcomp.sty \
tex-tgtermes.sty \
tex-threeparttable.sty \
tex-times.sty \
tex-titlesec.sty \
tex-upquote.sty \
tex-utf8.def \
tex-utf8x.def \
tex-varwidth.sty \
tex-wrapfig.sty \
texlive-dvipng \
texlive-gnu-freefont \
texlive-latex \
texlive-latexmk \
texlive-makeindex \
texlive-metafont \
texlive-pdftex"

inherit rpm
