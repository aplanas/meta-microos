SUMMARY = "Sphinx packages for LaTeX"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the LaTeX components for python-Sphinx."
LICENSE = "BSD-2-Clause"

PV = "7.2.4"

RPM_NAME = "python310-Sphinx-latex-7.2.4-1.1.noarch.rpm"
RPM_HASH = "e8d634bff68c34881b1b8628825b92ad34fd908abe71f272785410b5a6a15166acd781d52b36cea0948803d894f6a038aeb77f4f8ac3e403edda98850e5ecc9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Sphinx-latex"

RDEPENDS:${PN} += "python310-Sphinx \
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
