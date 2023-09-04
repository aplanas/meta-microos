SUMMARY = "Cockpit user interface for storage, using udisks"
DESCRIPTION = "The Cockpit component for managing storage.  This package uses udisks."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-storaged-298-1.1.noarch.rpm"
RPM_HASH = "bfef4d7c44271378dd7a25b1b0883bcaa3c0ebdfc2e9b96070d8de0c9c25d077b8497580f078bbc8685e65e0790fda44e8773db86269a9694d45d0dad0a43890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-storaged"

RDEPENDS:${PN} += "/usr/bin/python3 \
cockpit-shell \
libudisks2-0-lvm2 \
python3-dbus-python \
udisks2"

inherit rpm
