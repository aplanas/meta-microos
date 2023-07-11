SUMMARY = "Python library for generating holidays on the fly"
DESCRIPTION = "A Python library for generating country, province and state specific sets of holidays on the fly. \
It makes determining whether a specific date is a holiday possible."
LICENSE = "MIT"

PV = "0.20"

RPM_NAME = "python310-holidays-0.20-1.4.noarch.rpm"
RPM_HASH = "a37da3d298a35a817c53d6ca076d69233607b0dc3bd6ffbeb751be5e03ecac39a66183ac2ded4629f3d15f5baddee90b8d749ced0ae25b566329857de671f2fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-holidays \
python310-holidays \
python3dist-holidays"

RDEPENDS:${PN} += "python-abi \
python310-convertdate \
python310-hijri-converter \
python310-korean-lunar-calendar \
python310-python-dateutil"

inherit rpm
