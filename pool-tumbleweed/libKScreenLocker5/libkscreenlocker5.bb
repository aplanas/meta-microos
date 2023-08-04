SUMMARY = "Library and components for secure lock screen architecture"
DESCRIPTION = "Library and components for secure lock screen architecture."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libKScreenLocker5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "abd7b43442f8c2614363570f33616a581f45790061846799facc9afb82bc135e36ed10e59c77738ec8b5cf55628b310d1428e2e0f84152d92eb3bc43051fcff1"

RPROVIDES:${PN} += "libKScreenLocker.so.5 \
libKScreenLocker5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigQml.so.5 \
libKF5CoreAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5Notifications.so.5 \
libKF5Package.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-server.so.0 \
libxcb-keysyms.so.1 \
libxcb.so.1"

inherit rpm
