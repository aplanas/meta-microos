SUMMARY = "Python Crontab API"
DESCRIPTION = "Crontab module for reading and writing crontab files and \
accessing the system cron automatically using an API."
LICENSE = "LGPL-3.0-only"

PV = "2.7.1"

RPM_NAME = "python310-python-crontab-2.7.1-1.2.noarch.rpm"
RPM_HASH = "465dce9c9bc6dd94683429f91d2b3720f9f25ae7bfc2b5b251626546eaaab58be995ae228686a2010469cdde16c6e8d299ede2834f44ddaecb183a229cbc5196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-crontab \
python3.10dist(python-crontab) \
python310-python-crontab \
python3dist(python-crontab)"

RDEPENDS:${PN} += "python(abi) \
python310-python-dateutil"

inherit rpm
