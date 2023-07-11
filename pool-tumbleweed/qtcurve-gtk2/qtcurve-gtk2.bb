SUMMARY = "QtCurve style for GTK+ 2"
DESCRIPTION = "This package contains the QtCurve engine for GTK+ 2. QtCurve is a set \
of widget styles available for Qt and GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "qtcurve-gtk2-1.9.0-6.18.aarch64.rpm"
RPM_HASH = "371a8ddf0831d682cb1cf69d585dd5ea3ec71bd36bbfa5017bfc626670fa8631d04260cd3f8a9ca4550b90ff2ab42eb1fed6e921523dc064f9384880dfa49467"

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
