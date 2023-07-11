SUMMARY = "Python helpers for manipulating datetime objects relative to time zones"
DESCRIPTION = "Python helpers for manipulating datetime objects relative to time zones."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-fleming-0.7.0-1.5.noarch.rpm"
RPM_HASH = "56f08058470320f6d9ca5189a3b7ea92eba76845d29e7414ca640f8fd56d6d78d2bf110fea40191f67995dceb09fffc020e0327f99fc67cdade07b017247ee32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fleming \
python310-fleming \
python3dist-fleming"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil \
python310-pytz"

inherit rpm
