SUMMARY = "OBS Package Installer (CLI)"
DESCRIPTION = "OBS Package Installer (CLI)"
LICENSE = "GPL-3.0-only"

PV = "3.2.0"

RPM_NAME = "opi-3.2.0-1.1.noarch.rpm"
RPM_HASH = "19e809b7ffafb5af1bc9909bac39ea261fb2a30505d76a981b339c7fa4d4cbbb7b83e821330c70e3ce96856ec71d02dc0780a482d14a9a984710175f4d3123da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-opi \
opi \
python3.11dist-opi \
python3dist-opi"

RDEPENDS:${PN} += "/usr/bin/python3 \
curl \
python-abi \
python3-curses \
python3-lxml \
python3-requests \
python3-rpm \
python3-termcolor \
sudo \
zypper"

inherit rpm
