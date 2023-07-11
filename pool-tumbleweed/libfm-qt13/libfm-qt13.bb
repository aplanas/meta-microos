SUMMARY = "Library providing components to build desktop file managers"
DESCRIPTION = "libfm-qt is the Qt port of libfm, a library providing components to \
build desktop file managers."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "libfm-qt13-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "7d6a0cdb5415925b1b1827364104a2bf1915c98d8b09de2c321e7046bd4c2ffa67c8021738f1d338d547f21a878228e938e8509f3c125e806c7b4dd61b075f50"

RPROVIDES:${PN} += "libfm-qt \
libfm-qt.so.13 \
libfm-qt13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libexif.so.12 \
libfm-qt-data \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmenu-cache.so.3 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
