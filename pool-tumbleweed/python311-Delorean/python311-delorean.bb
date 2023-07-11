SUMMARY = "Python library for manipulating datetimes"
DESCRIPTION = "Delorean is a library for clearing up the inconvenient truths that \
arise dealing with datetimes in Python."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-Delorean-1.0.0-4.8.noarch.rpm"
RPM_HASH = "8be8b8f36be7ae16f33b433fb0965c17ff9e843f60a11e555e3b49aec272db393ad33a8527d1e0cc640a1b206717e5f3595327433adda4845846c53dafed42a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Delorean \
python3.11dist-delorean \
python311-Delorean \
python3dist-delorean"

RDEPENDS:${PN} += "python-abi \
python311-Babel \
python311-humanize \
python311-python-dateutil \
python311-pytz \
python311-tzlocal"

inherit rpm
