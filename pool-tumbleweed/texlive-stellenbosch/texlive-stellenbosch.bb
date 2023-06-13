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

PV = "2023.201.11asvn66379"

RPM_NAME = "texlive-stellenbosch-2023.201.11asvn66379-57.1.noarch.rpm"
RPM_HASH = "7669c1ced3abc73df42eb9d72c10a19115009964f890bc116481283ec9bd958cc549cc6630da19c695a82c2727153f0765e4ff40670f6d791e7a36bab0d03539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(usbib.sty) \
tex(usnomencl.sty) \
tex(ussummary.sty) \
tex(usthesis.cls) \
tex(usthesis.sty) \
tex(ustitle.sty) \
texlive-stellenbosch"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(calc.sty) \
tex(colortbl.sty) \
tex(ifpdf.sty) \
tex(ifthen.sty) \
tex(keyval.sty) \
tex(longtable.sty) \
tex(natbib.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
