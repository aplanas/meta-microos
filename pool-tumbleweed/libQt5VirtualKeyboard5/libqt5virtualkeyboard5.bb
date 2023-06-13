SUMMARY = "Qt5 Virtual Keyboard library"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support."
LICENSE = "GPL-3.0"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5VirtualKeyboard5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "12949e01f73695b962cab47a42a73b793ba1df25f1bd20ebf15a5ec0723cb926c5a5e6aebecfd59e37c000412be0bb578b8b5c21bd38cd5d9ee6ea91b01b4386"

RPROVIDES:${PN} += "libQt5VirtualKeyboard.so.5()(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5)(64bit) \
libQt5VirtualKeyboard5 \
libQt5VirtualKeyboard5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
