SUMMARY = "Python helpers for manipulating datetime objects relative to time zones"
DESCRIPTION = "Python helpers for manipulating datetime objects relative to time zones."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-fleming-0.7.0-1.3.noarch.rpm"
RPM_HASH = "0f572f5146d168588949b305721ead455ed7856e52dc8082e87e00cd1f68dbf6e9d445735616f04c654c495425f1ceb451c917391a96fd048804791160db2b02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fleming) \
python311-fleming \
python3dist(fleming)"
RDEPENDS:${PN} += "python(abi) \
python311-python-dateutil \
python311-pytz"

inherit rpm
