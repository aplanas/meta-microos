SUMMARY = "OBS Package Installer (CLI)"
DESCRIPTION = "OBS Package Installer (CLI)"
LICENSE = "GPL-3.0-only"

PV = "3.3.0"

RPM_NAME = "opi-3.3.0-1.1.noarch.rpm"
RPM_HASH = "41749cd1c6a147008f01a771af5ff3839914c90fe3fa4d9be5e66b5a28e91070243adbce1ca0dd6017b35832a48d17fb6232ba95577b819e236b3140bde0fc3b"
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
