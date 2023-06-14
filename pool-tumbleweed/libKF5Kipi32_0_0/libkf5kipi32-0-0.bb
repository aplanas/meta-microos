SUMMARY = "KDE Image Plug-In Interface"
DESCRIPTION = "This package provides a generic KDE image plug-in interface used by \
some KDE image applications. Plug-ins for this interface are in the \
kipi-plugins package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "23.04.1"

RPM_NAME = "libKF5Kipi32_0_0-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d6b6727cccd8e01c684d2747b102f329f5fdad7cbb7d1f079087b55118b8dc94410ebd365b174e51b50f131341320a4c62dbceae2202ad1eedce6416b954d716"

RPROVIDES:${PN} += "libKF5Kipi.so.32.0.0 \
libKF5Kipi32-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Service.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libkipi-data \
libstdc++.so.6"

inherit rpm
