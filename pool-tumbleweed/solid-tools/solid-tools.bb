SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
CLI utilities."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "solid-tools-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "4836a6b10176b686ece194f89450a28adb2fdfa4a5054e057d8825ab6bbfa6b647c827976856a7ed2a7e60b293b8b59b03a8e64d7089249d87bbbe662dc55e7d"

RPROVIDES:${PN} += "solid-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
