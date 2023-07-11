SUMMARY = "Library to create Barcodes with Python"
DESCRIPTION = "Library to create standard barcodes with Python. No external modules needed (optional PIL support included)."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python39-python-barcode-0.14.0-1.7.noarch.rpm"
RPM_HASH = "859db1ec8ec652ed9dc9270076896ae6b6ec8084452203f3ebe7dd30d23906938dfac3a1cbab4b6e988e317fd30c9732ceba77c0aa3496027a8b716f4e37d8b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-barcode \
python39-pyBarcode \
python39-python-barcode \
python3dist-python-barcode"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
dejavu-fonts \
python-abi \
update-alternatives"

inherit rpm
