SUMMARY = "Cockpit user interface for storage, using udisks"
DESCRIPTION = "The Cockpit component for managing storage.  This package uses udisks."
LICENSE = "LGPL-2.1-or-later"

PV = "300.1"

RPM_NAME = "cockpit-storaged-300.1-1.1.noarch.rpm"
RPM_HASH = "906b37957cfe0e109d5da129e2e70feb010caf3deced7aec109dc687591d2651f290697c685b6b23fbbb8de4d2c5274741a071715ab1c32e77f5eb6455eb2770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-storaged"

RDEPENDS:${PN} += "/usr/bin/python3 \
cockpit-shell \
libudisks2-0-lvm2 \
python3-dbus-python \
udisks2"

inherit rpm
