SUMMARY = "PDF parser and analyzer"
DESCRIPTION = "Pdfminer.six is a community maintained fork of the original PDFMiner. It \
is a tool for extracting information from PDF documents. It focuses on \
getting and analyzing text data. Pdfminer.six extracts the text from a \
page directly from the sourcecode of the PDF. It can also be used to get \
the exact location, font or color of the text."
LICENSE = "MIT"

PV = "20200726"

RPM_NAME = "python310-pdfminer.six-20200726-3.3.noarch.rpm"
RPM_HASH = "63bf05716550de7ee5248e4b792bb2b8dba6d4113cbb05e2a0c6ae5c4caa200f385d9ed4f94be4fe41c7789678111ffbf8514f08516c7725fed483f467dffb47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pdfminer.six \
python310-pdfminer.six \
python310-pdfminer3k \
python3dist-pdfminer.six"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-chardet \
python310-cryptography \
python310-sortedcontainers \
update-alternatives"

inherit rpm
