SUMMARY = "Daemon process control library and tools"
DESCRIPTION = "zdaemon is a Python package which provides APIs for managing \
applications run as daemons. Its principal use to date has been to \
manage the application server and storage server daemons for Zope / ZEO, \
although it is not limited to running Python-based applications"
LICENSE = "ZPL-2.1"

PV = "4.4"

RPM_NAME = "python39-zdaemon-4.4-1.6.noarch.rpm"
RPM_HASH = "d95aa5e8f3ea8ae9eeb972d4a9d2154c05713231a94bc45d7e8acde752d1014f00dab58c08a3924495b7e04b3105b32acc7fc6440e12653ea2f2254c0735c0df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zdaemon \
python39-zdaemon \
python3dist-zdaemon"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-ZConfig \
update-alternatives"

inherit rpm
