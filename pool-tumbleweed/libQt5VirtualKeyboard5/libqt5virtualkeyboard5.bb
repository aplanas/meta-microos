SUMMARY = "Qt5 Virtual Keyboard library"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support."
LICENSE = "GPL-3.0"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5VirtualKeyboard5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "12949e01f73695b962cab47a42a73b793ba1df25f1bd20ebf15a5ec0723cb926c5a5e6aebecfd59e37c000412be0bb578b8b5c21bd38cd5d9ee6ea91b01b4386"

RPROVIDES:${PN} += "libQt5VirtualKeyboard.so.5()(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.0)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.1)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.10)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.11)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.12)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.13)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.14)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.15)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.2)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.3)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.4)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.5)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.6)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.7)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.8)(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5.9)(64bit) \
libQt5VirtualKeyboard5 \
libQt5VirtualKeyboard5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
