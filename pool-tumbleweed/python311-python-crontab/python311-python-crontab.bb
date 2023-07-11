SUMMARY = "Python Crontab API"
DESCRIPTION = "Crontab module for reading and writing crontab files and \
accessing the system cron automatically using an API."
LICENSE = "LGPL-3.0-only"

PV = "2.7.1"

RPM_NAME = "python311-python-crontab-2.7.1-1.3.noarch.rpm"
RPM_HASH = "afefe43b137ce96654dad4a4147dee64e1a46ed7cc59d7fc54bbac8cdfdab6da0e4f0bb4b2865eff240e4de17e2db6e78cec5dab6a538323473e21dd9c7322ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-crontab \
python3.11dist-python-crontab \
python311-python-crontab \
python3dist-python-crontab"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil"

inherit rpm
