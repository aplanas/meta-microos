SUMMARY = "Python helpers for manipulating datetime objects relative to time zones"
DESCRIPTION = "Python helpers for manipulating datetime objects relative to time zones."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-fleming-0.7.0-1.5.noarch.rpm"
RPM_HASH = "10ee51009488bac67b9da56191f9b37fe17cfa21010a4dc83b7d753ebd914993e08d1ed0b4b7e2af32c24f56cf2d0d715ae5fa6391a2cf3fede60acaa3e07033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fleming \
python39-fleming \
python3dist-fleming"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil \
python39-pytz"

inherit rpm
