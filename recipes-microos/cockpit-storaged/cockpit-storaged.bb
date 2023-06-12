SUMMARY = "Cockpit user interface for storage, using udisks"
DESCRIPTION = "The Cockpit component for managing storage.  This package uses udisks."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-storaged-276.1-4.4.noarch.rpm"
RPM_HASH = "8e2ebb7bff6c44096d8672b4bf31906ad8a198681e4aea9814e996482b812f81860638ecc3d41ef5d2adbb66ac59d4bbe1c07338fe5ac95726a339dd8ed2d63a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-storaged metainfo() metainfo(org.cockpit-project.cockpit-storaged.metainfo.xml)"
RDEPENDS:${PN} += "/usr/bin/python3 cockpit-shell libudisks2-0_lvm2 python3-dbus-python udisks2"

inherit rpm
