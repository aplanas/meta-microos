SUMMARY = "Python library for generating holidays on the fly"
DESCRIPTION = "A Python library for generating country, province and state specific sets of holidays on the fly. \
It makes determining whether a specific date is a holiday possible."
LICENSE = "MIT"

PV = "0.20"

RPM_NAME = "python311-holidays-0.20-1.4.noarch.rpm"
RPM_HASH = "a4291b07d48f921904ecec07513fc91dcc3623b3f9afc4c3ad354e7423caf97190e9c797284a8bfb398028fad767c04ba37ab8c8fdccf3fef9289bf6ec4f8d7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-holidays \
python3.11dist-holidays \
python311-holidays \
python3dist-holidays"

RDEPENDS:${PN} += "python-abi \
python311-convertdate \
python311-hijri-converter \
python311-korean-lunar-calendar \
python311-python-dateutil"

inherit rpm
