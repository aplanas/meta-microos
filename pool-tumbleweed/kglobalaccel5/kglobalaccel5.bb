SUMMARY = "Configurable global shortcut support"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent \
of the focused window. Unlike regular shortcuts, the application's window \
does not need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kglobalaccel5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "afd1d5f17c5c24ffd9d2272a6440da00ba256809fa09a30522310d1239e10866fbd8641f97e118f35d8d3e0f37c5e6663d0149a9284b5eb2fad3a6d0e7f171cc"

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
