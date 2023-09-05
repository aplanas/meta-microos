SUMMARY = "OBS Package Installer (CLI)"
DESCRIPTION = "OBS Package Installer (CLI)"
LICENSE = "GPL-3.0-only"

PV = "3.4.0"

RPM_NAME = "opi-3.4.0-1.1.noarch.rpm"
RPM_HASH = "4446793fbbb1455b696ce19f6f73acdc914340c94332618a158f3bda2ea592c3967774c93a7a27ea7f76d29ea83626c578c990b8dc040bc081a537fb7e9d76fb"
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
