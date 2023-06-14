SUMMARY = "Development tool to test KParts"
DESCRIPTION = "kpartloader is a debugging tool used to test \
loading of KParts."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kpartloader-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "c0791f3e7d94f329b8b619a07ef6e231b55d53d9faa1cd2c60b23ad5e099c59baec7849abd9c6c069488bba738aff1827d41f2ee20fad14ac0f021e439f01cfa"

RPROVIDES:${PN} += "kpartloader"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
