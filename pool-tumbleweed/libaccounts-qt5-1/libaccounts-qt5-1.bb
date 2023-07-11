SUMMARY = "Qt library for Single Sign On"
DESCRIPTION = "This package contains the Qt library for Single Sign On."
LICENSE = "LGPL-2.1-only"

PV = "1.16"

RPM_NAME = "libaccounts-qt5-1-1.16-1.19.aarch64.rpm"
RPM_HASH = "c52c25b920344a30b3d84bdff5dcf4278d7cd36fdae5c0113654f0d95f3c3e44b74da52b0e3cc2d959aab3ed9cfdf2377b9e8cebd459173cbf3cfc5a8c963162"

RPROVIDES:${PN} += "libaccounts-qt5-1 \
libaccounts-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Xml.so.5 \
libaccounts-glib.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
