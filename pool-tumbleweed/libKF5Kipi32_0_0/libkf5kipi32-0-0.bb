SUMMARY = "KDE Image Plug-In Interface"
DESCRIPTION = "This package provides a generic KDE image plug-in interface used by \
some KDE image applications. Plug-ins for this interface are in the \
kipi-plugins package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "23.04.1"

RPM_NAME = "libKF5Kipi32_0_0-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d6b6727cccd8e01c684d2747b102f329f5fdad7cbb7d1f079087b55118b8dc94410ebd365b174e51b50f131341320a4c62dbceae2202ad1eedce6416b954d716"

RPROVIDES:${PN} += "libKF5Kipi.so.32.0.0()(64bit) \
libKF5Kipi32_0_0 \
libKF5Kipi32_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libkipi-data \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
