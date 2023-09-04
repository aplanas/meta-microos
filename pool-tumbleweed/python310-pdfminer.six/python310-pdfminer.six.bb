SUMMARY = "PDF parser and analyzer"
DESCRIPTION = "Pdfminer.six is a community maintained fork of the original PDFMiner. It \
is a tool for extracting information from PDF documents. It focuses on \
getting and analyzing text data. Pdfminer.six extracts the text from a \
page directly from the sourcecode of the PDF. It can also be used to get \
the exact location, font or color of the text."
LICENSE = "MIT"

PV = "20200726"

RPM_NAME = "python310-pdfminer.six-20200726-4.1.noarch.rpm"
RPM_HASH = "7b05a463a6b9867f332e897a0c13033387e83559d5303d1ea44f8a3c913bda475faeaa37cefb6f0e1689aefdc29bcfe109d5ea21a51cba64f034c7570ef1bebe"
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
