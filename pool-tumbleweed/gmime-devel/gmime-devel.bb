SUMMARY = "MIME Parser and Utility Library -- Development Files"
DESCRIPTION = "GMime is a C/C++ library for parsing and creating messages using \
the Multipurpose Internet Mail Extension (MIME)."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.13"

RPM_NAME = "gmime-devel-3.2.13-1.2.aarch64.rpm"
RPM_HASH = "a8df4c6385ca8c10be49877f773868d63ca179c94aa5e58002456fbcaa7bc53e4ba52b0d130ca0a1f8cad9c8feadbe5b0d36f40445ce83c1d9c7188ba09b7895"

RPROVIDES:${PN} += "gmime-devel \
pkgconfig-gmime-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgmime-3-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
