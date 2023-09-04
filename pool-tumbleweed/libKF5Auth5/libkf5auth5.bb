SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Auth5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "5969618798c196f0f839ee440980b379571c6c80c32291ae3b0de8ae8a0537702c1dfc7fcf16bcc17844ba27b26d1c8ef971471ee9ca0a62abf76f5f2a576fb9"

RPROVIDES:${PN} += "libKF5Auth.so.5 \
libKF5Auth5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5AuthCore5 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libpolkit-qt5-core-1.so.1 \
libstdc++.so.6"

inherit rpm
