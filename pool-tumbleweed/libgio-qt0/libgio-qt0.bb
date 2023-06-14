SUMMARY = "A Qt wrapper library for Gio"
DESCRIPTION = "This is a Qt wrapper library for Gio (or say it's a glib/glibmm wrapper mainly \
focused on GIO module). This library is designed to be exception-free and avoid \
Qt application developer do direct access to glib/glibmm (so they can use Gio in \
a more Qt way)."
LICENSE = "LGPL-3.0-or-later"

PV = "0.0.11"

RPM_NAME = "libgio-qt0-0.0.11-1.6.aarch64.rpm"
RPM_HASH = "0906ee77666db6588c943400db9295d901d8ead55bdabcafd1db818211b945262a66350b246bf26656277250e6498b1655d41ce3a379e679a3b018c37f7a583b"

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
