SUMMARY = "Libraries and headers for adding NetworkManager support to applications"
DESCRIPTION = "This package contains various headers accessing some NetworkManager \
functionality from applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-devel-1.42.6-2.1.aarch64.rpm"
RPM_HASH = "6ee80af85f4d752392a04f166c0dc7872d9edcb2e1bad9d166ccfe647d07bf3bb3b3e03779e7b8214ba45ff128b48c25d821754c04a838961a8ab5cc22419be5"

RPROVIDES:${PN} += "NetworkManager-devel NetworkManager-devel(aarch-64) NetworkManager-doc pkgconfig(libnm) rpm_macro(_vpnservicedir)"
RDEPENDS:${PN} += "/usr/bin/pkg-config NetworkManager libnm0 pkgconfig(gio-2.0) typelib-1_0-NM-1_0"

inherit rpm
