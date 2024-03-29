SUMMARY = "Configurable global shortcut support"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent \
of the focused window. Unlike regular shortcuts, the application's window \
does not need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kglobalaccel5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "f3ad889ce9f7a48e4742287a4c39c8f899d0df02672368a68421ffadb7c68a7d270ba331925669b6937ea8ca2a2b3a592fc3a615a4ff59974be3719d8e341805"

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
