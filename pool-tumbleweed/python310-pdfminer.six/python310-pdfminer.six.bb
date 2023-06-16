SUMMARY = "PDF parser and analyzer"
DESCRIPTION = "Pdfminer.six is a community maintained fork of the original PDFMiner. It \
is a tool for extracting information from PDF documents. It focuses on \
getting and analyzing text data. Pdfminer.six extracts the text from a \
page directly from the sourcecode of the PDF. It can also be used to get \
the exact location, font or color of the text."
LICENSE = "MIT"

PV = "20200726"

RPM_NAME = "python310-pdfminer.six-20200726-3.1.noarch.rpm"
RPM_HASH = "a210774f95c34c861a0784b41735b8b75a2c48439d49ed7615a7cd2cacdc6cfb236f34e661a2d25acc2814b7e02e554b6a7d2be7da23d349386e5c8dc369b928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdfminer.six \
python3-pdfminer3k \
python3.10dist-pdfminer.six \
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
