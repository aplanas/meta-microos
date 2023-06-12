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

PV = "2023.201.1.4svn53521"

RPM_NAME = "texlive-pdfbook2-2023.201.1.4svn53521-51.1.noarch.rpm"
RPM_HASH = "470cb30b576d99b636c8b285995ee20d2f8664e0b48354d5ba5dbeff84fa43b164ec227a7fd2d0cbdc1f726df3e990eb620e22a4994c98221cf02a39623ab027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfbook2"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
