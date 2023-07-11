SUMMARY = "Scale and tile PDF images/pages to print on multiple pages"
DESCRIPTION = "Create a large poster by building it from \
multiple pages and/or printing it on large media. It expects as input a \
PDF file, normally printing on a single page. The output is again a \
PDF file, maybe containing multiple pages together building the \
poster. \
The input page will be scaled to obtain the desired size. \
 \
This is much like 'poster' does for Postscript files, but working \
with PDF. \
 \
For more information please refer to the manpage or visit \
the project homepage https://pdfposter.readthedocs.io/"
LICENSE = "GPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "pdfposter-0.8.1-1.2.noarch.rpm"
RPM_HASH = "4163dd72944cc917de036084a73cfa5d4003b0a0d802c26bd80763296555f793f74d7d89bd7f78cd81698a09b8587c0784387ec0dab8130ab95cd8f641acfb8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfposter \
python3.11dist-pdftools.pdfposter \
python3dist-pdftools.pdfposter"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyPDF2 \
python3-base"

inherit rpm
