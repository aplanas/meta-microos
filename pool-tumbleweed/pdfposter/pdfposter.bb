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

RPM_NAME = "pdfposter-0.8.1-1.1.noarch.rpm"
RPM_HASH = "32315a750f563b71d1c916a23679975dec85805533cf8a508418d832b49155f29f240d404a61b9d6d8126f7b776de5644f28ddedfe08d8eba358a9b870c6ea57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfposter \
python3.10dist(pdftools.pdfposter) \
python3dist(pdftools.pdfposter)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-PyPDF2 \
python3-base"

inherit rpm
