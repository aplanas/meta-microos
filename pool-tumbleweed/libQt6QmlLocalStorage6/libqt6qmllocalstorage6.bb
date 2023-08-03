SUMMARY = "Qt 6 QmlLocalStorage library"
DESCRIPTION = "The Qt 6 QmlLocalStorage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QmlLocalStorage6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "61e221eadef4d12aaa3469be1d122abe7abe5add16056020cfc6b1f71ec35a99cab78334cdc56bbe405964c9833db86de916152045ae31ece92ac774e98db078"

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
