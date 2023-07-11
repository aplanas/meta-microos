SUMMARY = "Development files for libayatana-appindicator"
DESCRIPTION = "This package contains the development files for the ayatana \
appindicator library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.91"

RPM_NAME = "libayatana-appindicator-devel-0.5.91-1.5.aarch64.rpm"
RPM_HASH = "e1b0841e11bd7de2b3d83569852f940d03efabd57a5d317e4dc2ca98405297b8d3e253b9ec4d3ac3922e1a85bb53a31c6a51c38a61ca43fbeaf707c72b77c68b"

RPROVIDES:${PN} += "libayatana-appindicator-devel \
pkgconfig-ayatana-appindicator-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-appindicator1 \
pkgconfig-ayatana-indicator-0.4 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-2.0"

inherit rpm
