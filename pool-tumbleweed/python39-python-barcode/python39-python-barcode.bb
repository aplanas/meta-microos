SUMMARY = "Library to create Barcodes with Python"
DESCRIPTION = "Library to create standard barcodes with Python. No external modules needed (optional PIL support included)."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python39-python-barcode-0.14.0-1.5.noarch.rpm"
RPM_HASH = "67a21a66fc98be644869e7592a152dc7ff259386372a4247d738d08917db54aa0896c902c91684d709358375afc1782db95c85eb9173c1406b8dafb83af017a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-barcode) \
python39-pyBarcode \
python39-python-barcode \
python3dist(python-barcode)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
dejavu-fonts \
python(abi) \
update-alternatives"

inherit rpm
