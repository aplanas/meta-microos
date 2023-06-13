SUMMARY = "Daemon process control library and tools"
DESCRIPTION = "zdaemon is a Python package which provides APIs for managing \
applications run as daemons. Its principal use to date has been to \
manage the application server and storage server daemons for Zope / ZEO, \
although it is not limited to running Python-based applications"
LICENSE = "ZPL-2.1"

PV = "4.4"

RPM_NAME = "python39-zdaemon-4.4-1.4.noarch.rpm"
RPM_HASH = "2c38a742508cfb5140f78b0c7fcfdaf04a9af72c67eb30ff4fed3f06857a767a0574f48e30148feb4722e05e84cc97a0e5a31bc37713fcb955e01e6fd6a5873b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zdaemon) \
python39-zdaemon \
python3dist(zdaemon)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-ZConfig \
update-alternatives"

inherit rpm
