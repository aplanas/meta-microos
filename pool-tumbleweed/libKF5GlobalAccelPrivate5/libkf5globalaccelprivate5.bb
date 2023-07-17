SUMMARY = "Global desktop keyboard shortcuts"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5GlobalAccelPrivate5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "271a045136e1ff80283f9b50ccef3d509f69bab8fa2197fadf44a3c08f6a50934ef34a909603731be45acef7d75ef03183963c2f06c6b8ff29a4878ef7fb81fd"

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
