SUMMARY = "Library to create Barcodes with Python"
DESCRIPTION = "Library to create standard barcodes with Python. No external modules needed (optional PIL support included)."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python311-python-barcode-0.14.0-1.7.noarch.rpm"
RPM_HASH = "eed988bdac60b445455f4c9ef3f74ea093d2667935f551db1fbee25d3e9bc9f9729302113333cf5d0b11ce9b6ee603e86dbd58b6473e2145e133a7a74ee161a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyBarcode \
python3-python-barcode \
python3.11dist-python-barcode \
python311-pyBarcode \
python311-python-barcode \
python3dist-python-barcode"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
dejavu-fonts \
python-abi \
update-alternatives"

inherit rpm
