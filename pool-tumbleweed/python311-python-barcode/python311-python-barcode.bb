SUMMARY = "Library to create Barcodes with Python"
DESCRIPTION = "Library to create standard barcodes with Python. No external modules needed (optional PIL support included)."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python311-python-barcode-0.14.0-1.5.noarch.rpm"
RPM_HASH = "44187974a5582ef8a0c63d8f2c888e441c6be7b82747b66602c9bd9869a9739af971a07de864220fee03803556ca47d41948c822d315b9e3687bb016c7a0c4b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-barcode \
python311-pyBarcode \
python311-python-barcode \
python3dist-python-barcode"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
dejavu-fonts \
python-abi \
update-alternatives"

inherit rpm
