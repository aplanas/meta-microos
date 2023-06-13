SUMMARY = "Python library for generating holidays on the fly"
DESCRIPTION = "A Python library for generating country, province and state specific sets of holidays on the fly. \
It makes determining whether a specific date is a holiday possible."
LICENSE = "MIT"

PV = "0.20"

RPM_NAME = "python311-holidays-0.20-1.2.noarch.rpm"
RPM_HASH = "e808e4a29a673facd8fb43d9c8b7df946eb057c7036a83b4350f3dfb6ba891a0b85dcf0372c4fb97bf69f1b07773d0a45d72bcaf2ae4eb63679a9744dfe27deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(holidays) \
python311-holidays \
python3dist(holidays)"

RDEPENDS:${PN} += "python(abi) \
python311-convertdate \
python311-hijri-converter \
python311-korean-lunar-calendar \
python311-python-dateutil"

inherit rpm
