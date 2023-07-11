SUMMARY = "A Qt wrapper library for Gio"
DESCRIPTION = "This is a Qt wrapper library for Gio (or say it's a glib/glibmm wrapper mainly \
focused on GIO module). This library is designed to be exception-free and avoid \
Qt application developer do direct access to glib/glibmm (so they can use Gio in \
a more Qt way)."
LICENSE = "LGPL-3.0-or-later"

PV = "0.0.11"

RPM_NAME = "libgio-qt0-0.0.11-1.7.aarch64.rpm"
RPM_HASH = "cae0d2c55ea9acf85d3925f65cb65ab74985130ed492f726505aec5155818a989eba812e6ad7662a718079161a27b7190e1603f11e3a1b7b7c0c3d286a95951e"

RPROVIDES:${PN} += "libgio-qt.so.0 \
libgio-qt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
