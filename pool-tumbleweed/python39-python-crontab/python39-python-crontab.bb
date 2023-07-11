SUMMARY = "Python Crontab API"
DESCRIPTION = "Crontab module for reading and writing crontab files and \
accessing the system cron automatically using an API."
LICENSE = "LGPL-3.0-only"

PV = "2.7.1"

RPM_NAME = "python39-python-crontab-2.7.1-1.3.noarch.rpm"
RPM_HASH = "0fb3ac47a309eb534293a09504a5fc9b5589a233e9f369a9becdcf1cd4ce784caf49e3f460bb41b77782a1fd388f22cb168b43bfabd1142c7be0ebdf265d2c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-crontab \
python39-python-crontab \
python3dist-python-crontab"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil"

inherit rpm
