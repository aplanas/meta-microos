SUMMARY = "Python helpers for manipulating datetime objects relative to time zones"
DESCRIPTION = "Python helpers for manipulating datetime objects relative to time zones."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-fleming-0.7.0-1.5.noarch.rpm"
RPM_HASH = "fdc47bb0ccefaa67ffe8e33c85f7818570d38ae95059d3eaee24a165be0c19fe14b92394e291a2b8be345c37ce2795055fc360779f93e46877f1c9e099f8e08b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fleming \
python3.11dist-fleming \
python311-fleming \
python3dist-fleming"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil \
python311-pytz"

inherit rpm
