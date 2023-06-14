SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
CLI utilities."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "solid-tools-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "59b47e8eae648cacd02df670ddcc1f13b5fb3dbdc601769a86a6b297959901992437a13aca234eaf7bb0e463ed46743d6d2999e938cd0a0df44fe9718c6da0fe"

RPROVIDES:${PN} += "solid-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
