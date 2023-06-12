SUMMARY = "RGB driver for Corsair keyboard and mice"
DESCRIPTION = "ckb is a driver for Corsair keyboards and mice. It brings the \
features of their proprietary CUE software to the Linux operating \
system. This project supports much of the same functionality, \
including full RGB animations."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.5.0"

RPM_NAME = "ckb-next-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "684f96a48b3a40eab876720079f8c4fcc9c379c58a0034457489837fa15b0cf4decc18af4bf298acc60cf22865037d8f33660535790c1126300d696e0b9ee0df"

RPROVIDES:${PN} += "application() \
application(ckb-next.desktop) \
ckb \
ckb-next \
ckb-next(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbusmenu-qt5.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libquazip1-qt5.so.1.4.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libxcb-ewmh.so.2()(64bit) \
libxcb-screensaver.so.0()(64bit) \
libxcb.so.1()(64bit) \
systemd"

inherit rpm
