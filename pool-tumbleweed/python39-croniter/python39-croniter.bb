SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "1.3.15"

RPM_NAME = "python39-croniter-1.3.15-1.1.noarch.rpm"
RPM_HASH = "3d1a5f4bae76b610b5c9eb4809cf1751797ae2be44483c2fbbcb85c6e797c574016d7c585215abee9f33bf7dab1d9014bf31ded2b097beb5ec246dd2432c5e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(croniter) \
python39-croniter \
python3dist(croniter)"

RDEPENDS:${PN} += "python(abi) \
python39-python-dateutil"

inherit rpm
