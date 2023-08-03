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

PV = "2023.209.aug._2022svn65631"

RPM_NAME = "texlive-olsak-misc-2023.209.aug._2022svn65631-55.1.noarch.rpm"
RPM_HASH = "f135a0d9ec3152bd6f75f31e465f75445712735acfe26e16a6667b339e7c7034730c3f20f833fe7cb0e2ac38f1eb642a5c541769eb7457caa2788d7ba35f8a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-booklet.tex \
tex-cropmarks.tex \
tex-qrcode.tex \
tex-scanbase.tex \
tex-scancsv.tex \
tex-xmlparser.tex \
texlive-olsak-misc"

RDEPENDS:${PN} += "/usr/bin/sh \
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
