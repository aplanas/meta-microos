SUMMARY = "Configurable global shortcut support"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent \
of the focused window. Unlike regular shortcuts, the application's window \
does not need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kglobalaccel5-5.106.0-2.1.aarch64.rpm"
RPM_HASH = "b21e949a21fb328418beb2a0e5c60ab715b8ddc7c99fd5978d39ff26e137d8d9981f99e4fda6419d0a077d8e8a50fdc23347088ca29fbce06a5c1ada0e3b395f"

RPROVIDES:${PN} += "kglobalaccel5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccelPrivate.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libstdc++.so.6 \
libxcb-keysyms.so.1 \
libxcb-record.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1"

inherit rpm
