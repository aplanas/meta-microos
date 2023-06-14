SUMMARY = "QtCurve style for GTK+ 2"
DESCRIPTION = "This package contains the QtCurve engine for GTK+ 2. QtCurve is a set \
of widget styles available for Qt and GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "qtcurve-gtk2-1.9.0-6.16.aarch64.rpm"
RPM_HASH = "1861a880b1e7d9c092faf3d83c93363d79a192d06fb31f4dc478c7a7b6f182bb8ab4fbd5d2d1c77422f548f16bbd6a4d51ecb03d9642a803f93f6c41d3c03185"

RPROVIDES:${PN} += "libqtcurve.so \
qtcurve-gtk2"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libqtcurve-cairo.so.1 \
libqtcurve-cairo1 \
libqtcurve-utils.so.2 \
libstdc++.so.6"

inherit rpm
