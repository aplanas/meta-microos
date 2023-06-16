SUMMARY = "Daemon process control library and tools"
DESCRIPTION = "zdaemon is a Python package which provides APIs for managing \
applications run as daemons. Its principal use to date has been to \
manage the application server and storage server daemons for Zope / ZEO, \
although it is not limited to running Python-based applications"
LICENSE = "ZPL-2.1"

PV = "4.4"

RPM_NAME = "python311-zdaemon-4.4-1.4.noarch.rpm"
RPM_HASH = "60429b10dbbc477364a6c2c6e23c2ef2f513fb82149a8717512ec65b96ad1905f9c7307a94de6518e6e71a952e280f0b6fb799ed5e40fb36683e96538c3f9eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zdaemon \
python311-zdaemon \
python3dist-zdaemon"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-ZConfig \
update-alternatives"

inherit rpm
