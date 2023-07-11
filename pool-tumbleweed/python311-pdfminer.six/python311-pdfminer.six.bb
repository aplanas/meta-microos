SUMMARY = "PDF parser and analyzer"
DESCRIPTION = "Pdfminer.six is a community maintained fork of the original PDFMiner. It \
is a tool for extracting information from PDF documents. It focuses on \
getting and analyzing text data. Pdfminer.six extracts the text from a \
page directly from the sourcecode of the PDF. It can also be used to get \
the exact location, font or color of the text."
LICENSE = "MIT"

PV = "20200726"

RPM_NAME = "python311-pdfminer.six-20200726-3.3.noarch.rpm"
RPM_HASH = "b964c32eadd36ec2795bd56173f23b052f83a3b79c9703ca6914de61fb83f4cafbd0a9386829cf7290d786a0ce6003bd0e2f86aafd90a287f3142f6be6adb2b3"
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
