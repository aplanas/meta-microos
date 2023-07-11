SUMMARY = "Development files for libayatana-appindicator3"
DESCRIPTION = "This package contains the development files for the ayatana \
appindicator3 library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.91"

RPM_NAME = "libayatana-appindicator3-devel-0.5.91-1.5.aarch64.rpm"
RPM_HASH = "a94a084a1dba22813bce4fe434f6a90decd6d7fc4cdaf36844c9840d38feccf5818fd5d02a8372c4819f0e4f18ba543824c6d4e2774fd2b746f77f7354755656"

RPROVIDES:${PN} += "libayatana-appindicator3-devel \
pkgconfig-ayatana-appindicator3-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-appindicator3-1 \
pkgconfig-ayatana-indicator3-0.4 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
