SUMMARY = "KDE's screen management library"
DESCRIPTION = "Shared library for dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libKF5Screen8-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "00fc81dff3d311f689f7865842bf6f7b90040759186f8a800cd5b955449fd79368677737a1a385f621037882ae610c5e48aef0eaee48d2c8f6492a9b83b6f156"

RPROVIDES:${PN} += "libKF5Screen.so.8()(64bit) \
libKF5Screen8 \
libKF5Screen8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
