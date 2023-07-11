SUMMARY = "Program to set debug verbosity for KDE applications"
DESCRIPTION = "This program allows to tune the debug output of KDE applications, ranging \
from verbose to completely silent."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdebugsettings-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "5308c5e31041092f6046e73f87e02587dd1361d97b479bdbfa3915514fe60882ef1cec2fe38b796010d0ea913036f534cdeaa7db5840f3ebd60b5d5a97062ac3"

RPROVIDES:${PN} += "kdebugsettings \
kdebugsettings5 \
libkdebugsettings.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
