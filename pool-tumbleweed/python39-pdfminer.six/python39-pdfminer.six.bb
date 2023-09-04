SUMMARY = "PDF parser and analyzer"
DESCRIPTION = "Pdfminer.six is a community maintained fork of the original PDFMiner. It \
is a tool for extracting information from PDF documents. It focuses on \
getting and analyzing text data. Pdfminer.six extracts the text from a \
page directly from the sourcecode of the PDF. It can also be used to get \
the exact location, font or color of the text."
LICENSE = "MIT"

PV = "20200726"

RPM_NAME = "python39-pdfminer.six-20200726-4.1.noarch.rpm"
RPM_HASH = "00b18c325925fa44f66bb19a6b081e2dd043b8b8746465e9bf77fabd55452e23d92092ba61fd94e556d5757cb9e9ce416c23c52bfbff75b544467f54b5a319ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pdfminer.six \
python39-pdfminer.six \
python39-pdfminer3k \
python3dist-pdfminer.six"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-chardet \
python39-cryptography \
python39-sortedcontainers \
update-alternatives"

inherit rpm
