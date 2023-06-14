SUMMARY = "Development files for gdk-pixbuf-xlib"
DESCRIPTION = "This package contains the development files for gdk-pixbuf-xlib."
LICENSE = "LGPL-2.1-or-later"

PV = "2.40.2"

RPM_NAME = "gdk-pixbuf-xlib-devel-2.40.2-1.10.aarch64.rpm"
RPM_HASH = "969577164d6e3b2176a75faebaa8b0fb4c93c4a423e88143985a81bb358e7e664dfc080d98e04dfc57451989ce9c93ea0232bc62ff8395af6d4252e41b23564d"

RPROVIDES:${PN} += "gdk-pixbuf-xlib-devel \
pkgconfig-gdk-pixbuf-xlib-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdk-pixbuf-xlib-2-0-0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-x11"

inherit rpm
