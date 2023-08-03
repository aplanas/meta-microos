SUMMARY = "Create booklets from PDF files"
DESCRIPTION = "This python program creates print-ready PDF files from some \
input PDF files for booklet printing. The resulting files need \
to be printed in landscape/long edge double sided printing. The \
default paper format depends on the locale and is chosen by \
pdfjam. It can be chosen using the --paper option. Before the \
pdf is composed, the input file is cropped to the relevant area \
in order to discard unnecessary white spaces. In this process, \
all pages are cropped to the same dimensions. Extra margins can \
be defined at the edges of the booklet and in the middle where \
the binding occurs. The output is written to INPUT-book.pdf. \
Existing files will be overwritten. All input files are \
processed seperately."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4svn53521"

RPM_NAME = "texlive-pdfbook2-2023.209.1.4svn53521-52.1.noarch.rpm"
RPM_HASH = "93b27476ab8cf6286bd5c6edc966ab77a97934ef34bd4b6af08e72486fe441d96408f6ff0b982ec3bd65c8763b00e5b552b4e81b92ce540834bfc06447015b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfbook2"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdfbook2-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
