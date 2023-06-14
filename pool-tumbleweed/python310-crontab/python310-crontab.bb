SUMMARY = "Python module for parsing and using crontab schedules"
DESCRIPTION = "This package offers a method of parsing crontab schedule entries and \
determining when an item should next be run. More specifically, it \
calculates a delay in seconds from when the .next() method is called \
to when the item should next be executed."
LICENSE = "LGPL-2.1-only"

PV = "0.23.0"

RPM_NAME = "python310-crontab-0.23.0-1.8.noarch.rpm"
RPM_HASH = "8fe2ef84e1daa24fea29faa387a549b6e1c1a454cb88797a50da403c75939c5a7f5cd97fcd17a833a164206b7d8c677e1f50387eaf2fbbd1295bb6eb6d726eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crontab \
python3.10dist-crontab \
python310-crontab \
python3dist-crontab"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil \
python310-pytz"

inherit rpm
