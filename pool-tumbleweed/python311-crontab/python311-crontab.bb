SUMMARY = "Python module for parsing and using crontab schedules"
DESCRIPTION = "This package offers a method of parsing crontab schedule entries and \
determining when an item should next be run. More specifically, it \
calculates a delay in seconds from when the .next() method is called \
to when the item should next be executed."
LICENSE = "LGPL-2.1-only"

PV = "0.23.0"

RPM_NAME = "python311-crontab-0.23.0-1.10.noarch.rpm"
RPM_HASH = "7a582b7658ed3bc0a79379b15c3b9a4a7bc8e9eaee06a9483000995c6040579096636678efccf27daaf3d053f40a0210fbb95e7514145c55e764fdb65df93fbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crontab \
python3.11dist-crontab \
python311-crontab \
python3dist-crontab"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil \
python311-pytz"

inherit rpm
