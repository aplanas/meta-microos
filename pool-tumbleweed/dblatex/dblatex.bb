SUMMARY = "DocBook to LaTeX Publishing"
DESCRIPTION = "dblatex is a program that transforms your SGML/XMLDocBook documents to DVI, \
PostScript or PDF by translating them into pure LaTeX as a first process. \
MathML 2.0 markups are supported, too. It started as a clone of DB2LaTeX."
LICENSE = "GPL-2.0-only"

PV = "0.3.12"

RPM_NAME = "dblatex-0.3.12-1.10.noarch.rpm"
RPM_HASH = "a2ecab66d748cf74e6a8f373c76e15b144fbcb072124f638bc3a69e904b674a8dc10dd5ca2427b4397e4291b38df4de665bfbe7aaff4ef3e282ddee0de114bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dblatex \
python3.11dist-dblatex \
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
