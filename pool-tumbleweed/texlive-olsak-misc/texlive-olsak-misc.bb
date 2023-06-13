SUMMARY = "Collection of plain TeX macros written by Petr Olsak"
DESCRIPTION = "This is a collection of various single-file plain TeX macros \
written by Petr Olsak. The documentation is included in each \
file separately. booklet.tex: re-orders PDF pages and collects \
them for booklet printing cnv.tex: conversion of texts \
cnv-pu.tex: example of usage of cnv.tex --- pdf outlines in \
Unicode cnv-word.tex: example of usage of cnv.tex --- word to \
word conversion eparam.tex: Full expansion during parameter \
scanning fun-coffee.tex: generates splotches in the document \
openclose.tex: repairs balanced text between \\Open ...\\Close \
pair qrcode.tex: QR code generated at TeX level scanbase.tex: \
parser of text-style mysql outputs scancsv.tex: parser of CSV \
format seplist.tex: macros with alternative separators of a \
parameter xmlparser.tex: parser of XML language"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.aug._2022svn65631"

RPM_NAME = "texlive-olsak-misc-2023.201.aug._2022svn65631-54.1.noarch.rpm"
RPM_HASH = "869644692769fb4560fb12e266d47b76f02c249e81e9c2644caebe08d363eed767fd55128104c5b8f07e9d76161db7d540f162d1560d9ce826714b99307a7748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(booklet.tex) \
tex(cropmarks.tex) \
tex(qrcode.tex) \
tex(scanbase.tex) \
tex(scancsv.tex) \
tex(xmlparser.tex) \
texlive-olsak-misc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
