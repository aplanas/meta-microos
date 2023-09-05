SUMMARY = "KDE Image Plug-In Interface"
DESCRIPTION = "This package provides a generic KDE image plug-in interface used by \
some KDE image applications. Plug-ins for this interface are in the \
kipi-plugins package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "23.08.0"

RPM_NAME = "libKF5Kipi32_0_0-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "4f9b9f620e5a67c4b0bb8579d269ca1bc3c9ae8039031916d452bd6fac8140a2dfd75fd2bff9dc345380982190588b4ae216c229702b7068e8d6c8ad20f03b67"

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
