SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
CLI utilities."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "solid-tools-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "91eabfaa66f39c3d822b4ce6e9043ab7c32124e6f4a52594537575fda18dc2300c9c38951ecb7c9b1c44bd97bf370be9fd8a77501ffb2c1b1826dd837fc78f75"

RPROVIDES:${PN} += "solid-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
