SUMMARY = "Busybox applets replacing vlan"
DESCRIPTION = "This package contains the symlinks to provide vlan with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-vlan-1.36.1-28.1.noarch.rpm"
RPM_HASH = "a9ba94578c9c91414aa12a1932c2a9c0c09971495b5fef526ed19c3404a7c1f17a433b6b156e5e6176ff276c63c29d3d65239f4923eebf9d9cc153995489a7c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-vlan"

RDEPENDS:${PN} += "busybox"

inherit rpm
