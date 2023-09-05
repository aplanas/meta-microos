SUMMARY = "Program to set debug verbosity for KDE applications"
DESCRIPTION = "This program allows to tune the debug output of KDE applications, ranging \
from verbose to completely silent."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdebugsettings-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "57c4dfab4ccf0220022b98a38e50db466445f2f64290fd7b980e1022ba6e6276ed1c3be0701ca9ee1bd84c13ecea3da5805d55aebc020671feba9c5f47e744a4"

RPROVIDES:${PN} += "kdebugsettings \
kdebugsettings5 \
libkdebugsettings.so.5 \
libkdebugsettingscore.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
