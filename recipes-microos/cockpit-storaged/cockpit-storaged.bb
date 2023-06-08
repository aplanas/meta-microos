SUMMARY = "Cockpit user interface for storage, using udisks"
DESCRIPTION = "The Cockpit component for managing storage.  This package uses udisks."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-storaged-276.1-4.3.noarch.rpm"
RPM_HASH = "c111b2aa67c0410588472a50e14fe41f3146e7be4f7c7a8b45815cb245519c7a57d4dbd732629dab6bb0e858a4e79582b2df8d687092fd3457af496c7e4cf501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-storaged metainfo() metainfo(org.cockpit-project.cockpit-storaged.metainfo.xml)"
RDEPENDS:${PN} += "/usr/bin/python3 cockpit-shell libudisks2-0_lvm2 python3-dbus-python udisks2"

inherit rpm
