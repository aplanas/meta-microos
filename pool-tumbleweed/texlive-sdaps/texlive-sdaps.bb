SUMMARY = "LaTeX support files for SDAPS"
DESCRIPTION = "This bundle contains LaTeX classes and packages to create \
machine readable questionnaires. Metadata is generated for the \
whole document and it is possible to process created forms \
fully automatically using the SDAPS main program. Features \
include: PDF Form generation Advanced array like layouting Can \
flow over multiple pages and repeats the header automatically \
Optional document wide alignment of array environments Has \
complex layout features like rotating the headers to safe space \
Ability to exchange rows and columns on the fly Different \
question types: Freeform text Single/multiple choice questions \
Range questions Layouting questions in rows or columns \
Possibility to pre-fill questionnaires from LaTeX"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.10svn65345"

RPM_NAME = "texlive-sdaps-2023.209.1.9.10svn65345-54.1.noarch.rpm"
RPM_HASH = "b1f6815a7bd34992e3f2f8003df28b31dca5af8fca3b2e95c845ef87d16dd17a6d7bed6ea5a3ff75a6b33d119f6e57b77994e0ae2d73136341087cc4f6d1f3aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sdapsarray.sty \
tex-sdapsbase.sty \
tex-sdapsclassic.cls \
tex-sdapscode128.tex \
tex-sdapslayout.sty \
tex-sdapspdf.sty \
texlive-sdaps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-babel.sty \
tex-color.sty \
tex-environ.sty \
tex-expl3.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-lastpage.sty \
tex-qrcode.sty \
tex-refcount.sty \
tex-scrartcl.cls \
tex-scrkbase.sty \
tex-scrlayer-scrpage.sty \
tex-sectsty.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-translator.sty \
tex-url.sty \
tex-verbatim.sty \
tex-xparse.sty \
texlive \
texlive-environ \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lastpage \
texlive-pgf \
texlive-qrcode \
texlive-scripts \
texlive-scripts-bin \
texlive-sectsty \
texlive-translator"

inherit rpm
