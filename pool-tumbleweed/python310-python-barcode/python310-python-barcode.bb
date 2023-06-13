SUMMARY = "Library to create Barcodes with Python"
DESCRIPTION = "Library to create standard barcodes with Python. No external modules needed (optional PIL support included)."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python310-python-barcode-0.14.0-1.5.noarch.rpm"
RPM_HASH = "3541b48e88d0ea2df0e197b4cd460e963299799828bcbad147ed866125c2e366f17607af2992cf8bb6df6dd11dc00ccd16f8721bb52bb0b407ec15903b964635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyBarcode \
python3-python-barcode \
python3.10dist(python-barcode) \
python310-pyBarcode \
python310-python-barcode \
python3dist(python-barcode)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
dejavu-fonts \
python(abi) \
update-alternatives"

inherit rpm
