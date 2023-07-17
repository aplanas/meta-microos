SUMMARY = "Qt 6 QmlLocalStorage library"
DESCRIPTION = "The Qt 6 QmlLocalStorage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlLocalStorage6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "4e671f771e4eb200c0766fd68696165abb062d0fc75cc25a66dbfae1f83003f67e54ac27715e1daf05277a5374ac75f3bd8cfcb551d194865ec31963c9d983ae"

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
