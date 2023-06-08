SUMMARY = "Libraries and headers for adding NetworkManager support to applications"
DESCRIPTION = "This package contains various headers accessing some NetworkManager \
functionality from applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-devel-1.42.6-1.1.aarch64.rpm"
RPM_HASH = "7fe16a64995426cf19952a22ff9e0a608d94baefcf9d2767a7d9ebb479cb86100bccd397e683f98cebe7fc5833fe2da11be22dde1b172650c679a4aaa7afdb9e"

RPROVIDES:${PN} += "NetworkManager-devel NetworkManager-devel(aarch-64) NetworkManager-doc pkgconfig(libnm) rpm_macro(_vpnservicedir)"
RDEPENDS:${PN} += "/usr/bin/pkg-config NetworkManager libnm0 pkgconfig(gio-2.0) typelib-1_0-NM-1_0"

inherit rpm
