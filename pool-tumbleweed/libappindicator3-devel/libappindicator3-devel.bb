SUMMARY = "Development files for libappindicator"
DESCRIPTION = "This package contains the development files for the appindicator3 library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "libappindicator3-devel-12.10.1~bzr20200706.298-2.4.aarch64.rpm"
RPM_HASH = "f1bc751a3b8545329b5ff6dc618596ed0c4d9958ee0ff2df9cd19573292cf935fac88bf064c0fd0fa59ae059445f5c52899e3fab970af3079ad864104f8227bd"

RPROVIDES:${PN} += "libappindicator3-devel \
pkgconfig-appindicator3-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libappindicator3-1 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-gtk+-3.0"

inherit rpm
