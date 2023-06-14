SUMMARY = "Python library for manipulating datetimes"
DESCRIPTION = "Delorean is a library for clearing up the inconvenient truths that \
arise dealing with datetimes in Python."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-Delorean-1.0.0-4.6.noarch.rpm"
RPM_HASH = "0248a86077f46ea8136050bee374cbca936358bd167d723986b40a0dd2465209f5a803aa1fc40574d9decfe1dcb4ddfc8af932a1f7f44320b306d4bf4d46ed04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-delorean \
python311-Delorean \
python3dist-delorean"

RDEPENDS:${PN} += "python-abi \
python311-Babel \
python311-humanize \
python311-python-dateutil \
python311-pytz \
python311-tzlocal"

inherit rpm
