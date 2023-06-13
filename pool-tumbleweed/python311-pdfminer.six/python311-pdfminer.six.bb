SUMMARY = "PDF parser and analyzer"
DESCRIPTION = "Pdfminer.six is a community maintained fork of the original PDFMiner. It \
is a tool for extracting information from PDF documents. It focuses on \
getting and analyzing text data. Pdfminer.six extracts the text from a \
page directly from the sourcecode of the PDF. It can also be used to get \
the exact location, font or color of the text."
LICENSE = "MIT"

PV = "20200726"

RPM_NAME = "python311-pdfminer.six-20200726-3.1.noarch.rpm"
RPM_HASH = "1c7bf088ecee37a955d0de8429c92e7e3bdd93be472785acd5d0f385da368fc547e7ebde11cab1f5a6f76cfbdd49da3261bd26d1f9fd4f1b0d6caaa71b7f5812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pdfminer.six) \
python311-pdfminer.six \
python311-pdfminer3k \
python3dist(pdfminer.six)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-chardet \
python311-cryptography \
python311-sortedcontainers \
update-alternatives"

inherit rpm
