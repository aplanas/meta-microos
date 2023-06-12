SUMMARY = "Python Crontab API"
DESCRIPTION = "Crontab module for reading and writing crontab files and \
accessing the system cron automatically using an API."
LICENSE = "LGPL-3.0-only"

PV = "2.7.1"

RPM_NAME = "python39-python-crontab-2.7.1-1.2.noarch.rpm"
RPM_HASH = "4275a062508dcc371245e2297e61a4ba2651ce215e130648c1b7fefa1142715c934760a9505b156994b1989a8e422f89be4464280aa407589fa3dc1ef7e2ca7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-crontab) \
python39-python-crontab \
python3dist(python-crontab)"
RDEPENDS:${PN} += "python(abi) \
python39-python-dateutil"

inherit rpm
