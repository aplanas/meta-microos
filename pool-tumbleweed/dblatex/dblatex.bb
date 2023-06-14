SUMMARY = "DocBook to LaTeX Publishing"
DESCRIPTION = "dblatex is a program that transforms your SGML/XMLDocBook documents to DVI, \
PostScript or PDF by translating them into pure LaTeX as a first process. \
MathML 2.0 markups are supported, too. It started as a clone of DB2LaTeX."
LICENSE = "GPL-2.0-only"

PV = "0.3.12"

RPM_NAME = "dblatex-0.3.12-1.9.noarch.rpm"
RPM_HASH = "056e193900ce5a3ebdf1dccf987b8be8a5f2c66854dd536ae06685c60578c06fd3bb8ef0086ab28298891a2ca58f69afcfcdaa133d0800e573267b665ecab931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dblatex \
python3.10dist-dblatex \
python3dist-dblatex"

RDEPENDS:${PN} += "/usr/bin/python3 \
docbook-4 \
python-abi \
tex-amsmath.sty \
tex-amssymb.sty \
tex-appendix.sty \
tex-bookmark.sty \
tex-calc.sty \
tex-changebar.sty \
tex-color.sty \
tex-colortbl.sty \
tex-fancyhdr.sty \
tex-fancyvrb.sty \
tex-float.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-graphicx.sty \
tex-hhline.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-listings.sty \
tex-longtable.sty \
tex-lscape.sty \
tex-multirow.sty \
tex-overpic.sty \
tex-pdfpages.sty \
tex-pifont.sty \
tex-refcount.sty \
tex-subfigure.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-titlesec.sty \
texlive-epstopdf \
texlive-latex"

inherit rpm
