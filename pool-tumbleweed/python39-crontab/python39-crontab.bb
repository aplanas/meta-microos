SUMMARY = "Python module for parsing and using crontab schedules"
DESCRIPTION = "This package offers a method of parsing crontab schedule entries and \
determining when an item should next be run. More specifically, it \
calculates a delay in seconds from when the .next() method is called \
to when the item should next be executed."
LICENSE = "LGPL-2.1-only"

PV = "0.23.0"

RPM_NAME = "python39-crontab-0.23.0-1.10.noarch.rpm"
RPM_HASH = "586dd7a579e427f9c9ce1d403925f71648d8fdc7ef6c4c1255efe335152f19513d7f5cb52f4c19ed0d90d0c3704a42eb52ff712fbf47af8500852b81d014df09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-crontab \
python39-crontab \
python3dist-crontab"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil \
python39-pytz"

inherit rpm
