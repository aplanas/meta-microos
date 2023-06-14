SUMMARY = "PolicyKit authentication agent for KDE"
DESCRIPTION = "Provides Policy Kit Authentication Agent that nicely fits to KDE."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "5.27.5"

RPM_NAME = "polkit-kde-agent-5-5.27.5-1.2.aarch64.rpm"
RPM_HASH = "ed4bb0091233b73905d179815c340f2dc7cdbae08965b0c86d58e9aa7331e76ddc82918752c107d8b0123ffb8f0705653daab0ff16930df5d4f3bdef4f28329f"

RPROVIDES:${PN} += "polkit-kde-agent-5"

RDEPENDS:${PN} += "/bin/sh \
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
