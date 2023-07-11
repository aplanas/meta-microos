SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "1.3.15"

RPM_NAME = "python310-croniter-1.3.15-2.1.noarch.rpm"
RPM_HASH = "04e06b5d791f987d2544a7bfb7f42e9c27440a1c21dec2a40bc78768d6240bc8f6a3dbc9eeac5630523927762f0bae30b9d02986fd466baea063b01cdd203ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-croniter \
python310-croniter \
python3dist-croniter"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil"

inherit rpm
