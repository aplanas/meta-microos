SUMMARY = "Qt 6 QmlLocalStorage library"
DESCRIPTION = "The Qt 6 QmlLocalStorage library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QmlLocalStorage6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "d052fb92a5f8bf53c9a83e4f7817ed10c1f2236aee604495bc0d787b2958dbe526fc296df2f61b21ea5af13c0a81507963400c547a992dcf21eb40a6ecd03921"

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
