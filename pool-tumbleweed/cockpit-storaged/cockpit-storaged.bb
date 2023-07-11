SUMMARY = "Cockpit user interface for storage, using udisks"
DESCRIPTION = "The Cockpit component for managing storage.  This package uses udisks."
LICENSE = "LGPL-2.1-or-later"

PV = "293"

RPM_NAME = "cockpit-storaged-293-1.1.noarch.rpm"
RPM_HASH = "631eb502fe5cb4ba60ef9d9228253a392d8c2754aa9304b1bc47d0cae055be0fca4836766835c95bca8c9c69a61792b56d84df1fe484c6ab82d289edcc8784f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-storaged"

RDEPENDS:${PN} += "/usr/bin/python3 \
cockpit-shell \
libudisks2-0-lvm2 \
python3-dbus-python \
udisks2"

inherit rpm
