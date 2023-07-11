SUMMARY = "Python interface for rpmconf"
DESCRIPTION = "Python interface for rpmconf and an essential part of rpmconf."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.9"

RPM_NAME = "python3-rpmconf-1.1.9-1.2.noarch.rpm"
RPM_HASH = "c443c17494a0963ae6f05ec11cf28f754de010b159ad353c8f60ecf39faebea14776009918341e7fa6aa20b8c548c7f12ce97f6f566e3bfab1cdbdaea57bb1ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpmconf \
python3.11dist-rpmconf \
python3dist-rpmconf"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
