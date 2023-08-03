SUMMARY = "Stellenbosch thesis bundle"
DESCRIPTION = "The usthesis class/style files are provided to typeset reports, \
theses and dissertations that conform to the requirements of \
the Engineering Faculty of the University of Stellenbosch. The \
class file usthesis.cls is based on the standard LaTeX book \
class, while usthesis.sty is a style file to be loaded on top \
of the very powerful memoir class. Both options give identical \
output, but the benefit of the using memoir is that it has many \
additional command and environments for formatting and \
processing of a document. Usthesis is primarily concerned with \
the formatting of the front matter such as the title page, \
abstract, etc. and a decent page layout on A4 paper. It also \
works together with the babel package to provide language \
options to typeset documents in Afrikaans or in English. \
Additional packages are provided for bibliographic matter, note \
title pages, lists of symbols, as well as various graphic files \
for logos."
LICENSE = "LPPL-1.0"

PV = "2023.209.11asvn66379"

RPM_NAME = "texlive-stellenbosch-2023.209.11asvn66379-58.1.noarch.rpm"
RPM_HASH = "8b159c35f95b7668ca85f412a4fc63ba56eacb9b94ee240e8bf170e727fd9536bd9883307da1c10acfbc5e739df8e9c4a0ed5fd5b36d8ea55f95e9f5b183f7b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-usbib.sty \
tex-usnomencl.sty \
tex-ussummary.sty \
tex-usthesis.cls \
tex-usthesis.sty \
tex-ustitle.sty \
texlive-stellenbosch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-colortbl.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-longtable.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
