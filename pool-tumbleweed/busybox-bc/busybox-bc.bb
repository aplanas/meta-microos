SUMMARY = "Busybox applets replacing bc"
DESCRIPTION = "This package contains the symlinks to provide bc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-bc-1.36.1-27.1.noarch.rpm"
RPM_HASH = "8433e6c6f702a4945ace178b09c540c4b26776edaae3373bdfa2e3dee3b28189d18d3001968e1bf0f662f695132fdc4ee02194cd98314b8de6c752dbf5e5dda5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bc"

RDEPENDS:${PN} += "busybox"

inherit rpm
