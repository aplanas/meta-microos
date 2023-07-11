SUMMARY = "KDE's screen management library"
DESCRIPTION = "Shared library for dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "libKF5Screen8-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "170b61834588ea662b8882536ce99267533f8d54bd86f97dee608ac189cad4c1bb3e4bf274900dc181595232fb5ec53cc3ebfa8fe72fdad34a9b10d6477d1881"

RPROVIDES:${PN} += "libKF5Screen.so.8 \
libKF5Screen8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
