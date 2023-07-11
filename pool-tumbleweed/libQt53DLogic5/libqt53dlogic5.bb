SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
Qt 3D Logic module enables synchronizing frames with the Qt 3D \
backend."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DLogic5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "5dbe74044b7391a9384b393de7810d7cfd829559da69355bab4e645705ca2b5cfd0afa2e5320abcdf79c9561c7b8ef570547d29d1526a4199058cf39a2f7c6b1"

RPROVIDES:${PN} += "libQt53DLogic.so.5 \
libQt53DLogic5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
