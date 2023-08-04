SUMMARY = "PolicyKit authentication agent for KDE"
DESCRIPTION = "Provides Policy Kit Authentication Agent that nicely fits to KDE."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "5.27.7"

RPM_NAME = "polkit-kde-agent-5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "692488b513973e2aca2dc01eb039dc0b7f4a794303956623348300c371486b41ff885adc56e29d198b60d804b1f351033c5b9b76935e37d39d7dbf97cc02cb25"

RPROVIDES:${PN} += "polkit-kde-agent-5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libpolkit-qt5-agent-1.so.1 \
libpolkit-qt5-core-1.so.1 \
libstdc++.so.6"

inherit rpm
