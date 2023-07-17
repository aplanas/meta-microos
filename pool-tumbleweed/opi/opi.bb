SUMMARY = "OBS Package Installer (CLI)"
DESCRIPTION = "OBS Package Installer (CLI)"
LICENSE = "GPL-3.0-only"

PV = "3.1.0"

RPM_NAME = "opi-3.1.0-1.1.noarch.rpm"
RPM_HASH = "a43bd326ee6b8ee60acdacf74703521dee26da4742cc3e3edb96deaa3bf473866666d0c7a4185994ec4975b2b2870a02605202378188178288bebc1a79ad2a0e"
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
