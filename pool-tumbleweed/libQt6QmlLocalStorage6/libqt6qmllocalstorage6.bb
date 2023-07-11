SUMMARY = "Qt 6 QmlLocalStorage library"
DESCRIPTION = "The Qt 6 QmlLocalStorage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlLocalStorage6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "1b829b9131b572c6d623df94cb0630cf74257c3ed7b858c382ec3c386043e4d82fe8b23fc4d5f5055d15015cad0a0fbe6f725b7ac6a7b811a403d7d33b62e7cd"

RPROVIDES:${PN} += "libQt6QmlLocalStorage.so.6 \
libQt6QmlLocalStorage6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
