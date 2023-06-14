SUMMARY = "Qt 6 QmlLocalStorage library"
DESCRIPTION = "The Qt 6 QmlLocalStorage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlLocalStorage6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "22465919371fd3fa04bd9ffef45d1ca7bf0949f0ab4b520ec85c6eae2576ebc54142c4db5c9dacc9d336d37845d9fc9218b4cb13fc2b263e91fa55ad85bdb25b"

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
