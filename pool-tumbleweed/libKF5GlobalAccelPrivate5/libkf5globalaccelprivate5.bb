SUMMARY = "Global desktop keyboard shortcuts"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5GlobalAccelPrivate5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "e4d5eda2736fa76d86a4880640a4e242fe5ad2ab568f56dfcc9f63ab593c2bb4a8d4675301a1cba4a40cb42953fc5bf6759100178318422b021ed68a0c9d6585"

RPROVIDES:${PN} += "libKF5GlobalAccelPrivate.so.5 \
libKF5GlobalAccelPrivate5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
