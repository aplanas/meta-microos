SUMMARY = "Cockpit user interface for storage, using udisks"
DESCRIPTION = "The Cockpit component for managing storage.  This package uses udisks."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-storaged-298-2.1.noarch.rpm"
RPM_HASH = "a308f1357f5c5f3e00cde2fdad98f11bbc55752c4936e505059e25c20f4e7c5a6cbec429e6b53049ed446376d7a64ef26527fa84482c27655c7bf5967be6c2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-storaged"

RDEPENDS:${PN} += "/usr/bin/python3 \
cockpit-shell \
libudisks2-0-lvm2 \
python3-dbus-python \
udisks2"

inherit rpm
