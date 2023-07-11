SUMMARY = "Daemon process control library and tools"
DESCRIPTION = "zdaemon is a Python package which provides APIs for managing \
applications run as daemons. Its principal use to date has been to \
manage the application server and storage server daemons for Zope / ZEO, \
although it is not limited to running Python-based applications"
LICENSE = "ZPL-2.1"

PV = "4.4"

RPM_NAME = "python310-zdaemon-4.4-1.6.noarch.rpm"
RPM_HASH = "0b78053d2316b4d855ce2532f3a918c0c09190a3cfd93f0e68acd5be76eea43aa9d490b89e1cdc1cc88111bb54f08063009f6b748b685625bcd74dc67b843661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zdaemon \
python310-zdaemon \
python3dist-zdaemon"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-ZConfig \
update-alternatives"

inherit rpm
