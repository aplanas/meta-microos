SUMMARY = "PDF parser and analyzer"
DESCRIPTION = "Pdfminer.six is a community maintained fork of the original PDFMiner. It \
is a tool for extracting information from PDF documents. It focuses on \
getting and analyzing text data. Pdfminer.six extracts the text from a \
page directly from the sourcecode of the PDF. It can also be used to get \
the exact location, font or color of the text."
LICENSE = "MIT"

PV = "20200726"

RPM_NAME = "python311-pdfminer.six-20200726-4.1.noarch.rpm"
RPM_HASH = "2918638545e4b058f922d57beeb2b2fca9255fab34eb31520144d7b27d7755ccae079572dc6d41fe485301e6fce57a55e89cb3b9d7936b9adb15d49bfb1100dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdfminer.six \
python3-pdfminer3k \
python3.11dist-pdfminer.six \
python311-pdfminer.six \
python311-pdfminer3k \
python3dist-pdfminer.six"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-chardet \
python311-cryptography \
python311-sortedcontainers \
update-alternatives"

inherit rpm
