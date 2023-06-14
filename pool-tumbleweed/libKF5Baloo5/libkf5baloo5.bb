SUMMARY = "Core library for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains Baloo's core library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "libKF5Baloo5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "b000feb720d893ed3e7f36c349b312e959f609fb8641193dfe125df236413bbd09e6b444cacbbfb11b8678a82c1997a520b33148acf90e3d8113c9a98cdedcab"

RPROVIDES:${PN} += "baloo5-lang \
libKF5Baloo.so.5 \
libKF5Baloo5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5BalooEngine.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
