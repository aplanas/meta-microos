SUMMARY = "Python Crontab API"
DESCRIPTION = "Crontab module for reading and writing crontab files and \
accessing the system cron automatically using an API."
LICENSE = "LGPL-3.0-only"

PV = "2.7.1"

RPM_NAME = "python310-python-crontab-2.7.1-1.3.noarch.rpm"
RPM_HASH = "b320622b1c82fb31112ee83d86594536f2abf63cd17d021238a6f163d49d9d46e1df8899dc5f1574b60740b004abde851f235a7428806d4066ef687d80c80f13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-crontab \
python310-python-crontab \
python3dist-python-crontab"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil"

inherit rpm
