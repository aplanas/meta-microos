SUMMARY = "Python helpers for manipulating datetime objects relative to time zones"
DESCRIPTION = "Python helpers for manipulating datetime objects relative to time zones."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-fleming-0.7.0-1.3.noarch.rpm"
RPM_HASH = "d9ba08138183fe912c1432f5080441f23a12b46927833bf964bd5535873413fd15eb150883d73bdf4cfd5448ab593d5f3ca4da0b6fc44e8f64d4505461201a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fleming \
python3.10dist-fleming \
python310-fleming \
python3dist-fleming"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil \
python310-pytz"

inherit rpm
