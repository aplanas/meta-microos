SUMMARY = "Library to create Barcodes with Python"
DESCRIPTION = "Library to create standard barcodes with Python. No external modules needed (optional PIL support included)."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python310-python-barcode-0.14.0-1.7.noarch.rpm"
RPM_HASH = "5c2b4f089903db69382e617a03b0df4e81b889b887269eab68c0c226408104d918119902b004ab72c926df73f11bb0a36fe59fa339b7153d84bf532414bce898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-barcode \
python310-pyBarcode \
python310-python-barcode \
python3dist-python-barcode"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
dejavu-fonts \
python-abi \
update-alternatives"

inherit rpm
