SUMMARY = "Daemon process control library and tools"
DESCRIPTION = "zdaemon is a Python package which provides APIs for managing \
applications run as daemons. Its principal use to date has been to \
manage the application server and storage server daemons for Zope / ZEO, \
although it is not limited to running Python-based applications"
LICENSE = "ZPL-2.1"

PV = "4.4"

RPM_NAME = "python311-zdaemon-4.4-1.6.noarch.rpm"
RPM_HASH = "19b0948afa946faa54fab42830aa31653a6860aa0c8b99fe665c4c88f3cb49f69de78e7cc7f547e1f6eb1e7c78217bf7db12d61d4b6f6a3774a27e6e383e1130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zdaemon \
python3.11dist-zdaemon \
python311-zdaemon \
python3dist-zdaemon"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-ZConfig \
update-alternatives"

inherit rpm
