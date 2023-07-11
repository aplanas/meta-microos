SUMMARY = "Python module for parsing and using crontab schedules"
DESCRIPTION = "This package offers a method of parsing crontab schedule entries and \
determining when an item should next be run. More specifically, it \
calculates a delay in seconds from when the .next() method is called \
to when the item should next be executed."
LICENSE = "LGPL-2.1-only"

PV = "0.23.0"

RPM_NAME = "python310-crontab-0.23.0-1.10.noarch.rpm"
RPM_HASH = "d50f3e227c1e40e2fbf2e1d7c688151520e45c8e44d20d8ffc8c023bad5d08c674e4fa5e4b1348a66d17719cb1aa6cfd2d45ae5e88f3ed07f33b89cb3da1d10c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-crontab \
python310-crontab \
python3dist-crontab"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil \
python310-pytz"

inherit rpm
