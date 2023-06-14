SUMMARY = "Python Crontab API"
DESCRIPTION = "Crontab module for reading and writing crontab files and \
accessing the system cron automatically using an API."
LICENSE = "LGPL-3.0-only"

PV = "2.7.1"

RPM_NAME = "python311-python-crontab-2.7.1-1.2.noarch.rpm"
RPM_HASH = "32ff31e982b39cc75c0498808960bdcc40a1e28db7576a2a31300cce7e06f76519e391a6d7397ee723f4a86e254bacd128d995c97ed1d52105d0c84b20409db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-crontab \
python311-python-crontab \
python3dist-python-crontab"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil"

inherit rpm
