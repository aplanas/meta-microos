SUMMARY = "OBS Package Installer (CLI)"
DESCRIPTION = "OBS Package Installer (CLI)"
LICENSE = "GPL-3.0-only"

PV = "3.0.0"

RPM_NAME = "opi-3.0.0-1.1.noarch.rpm"
RPM_HASH = "b6d55ebdea3a6a61c1d019439c81ebef69c2271c6e185cbb503ba1a61fb55a93b3d30dcc367d602b3c847f7dd0fda2aaa66f1fd850bfc938574366d4588e1764"
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
