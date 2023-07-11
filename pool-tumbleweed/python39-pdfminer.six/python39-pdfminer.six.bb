SUMMARY = "PDF parser and analyzer"
DESCRIPTION = "Pdfminer.six is a community maintained fork of the original PDFMiner. It \
is a tool for extracting information from PDF documents. It focuses on \
getting and analyzing text data. Pdfminer.six extracts the text from a \
page directly from the sourcecode of the PDF. It can also be used to get \
the exact location, font or color of the text."
LICENSE = "MIT"

PV = "20200726"

RPM_NAME = "python39-pdfminer.six-20200726-3.3.noarch.rpm"
RPM_HASH = "68e27976e3b46d1addb12ad406ca6f3234089551a071104022c5451c87e9d2d5264ff57a7cf31be28bfbe03e251ec22f14d82ebaa56fc67c8933214771d42eff"
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
