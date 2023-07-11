SUMMARY = "PolicyKit authentication agent for KDE"
DESCRIPTION = "Provides Policy Kit Authentication Agent that nicely fits to KDE."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "5.27.6"

RPM_NAME = "polkit-kde-agent-5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "d3c1ba486213e1fafb61f17804b69fc45f16c17aa99465a276e3e281e5d46c72dab6091ef036e840459ca066235beedcc5b18cca79ec694bbcb1d395937490f6"

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
