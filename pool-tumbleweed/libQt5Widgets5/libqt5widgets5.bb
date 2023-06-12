SUMMARY = "Qt 5 Widgets Library"
DESCRIPTION = "The Qt Widgets Module provides a set of UI elements to create classic \
desktop-style user interfaces."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Widgets5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "9442d39a44e3af62f0e56016db7ebbfe4ca3913f22768ea805211006802be23542753aeefe184bdad930e8466f0517264667b5b9350e7cd9347e7ef989b65729"

RPROVIDES:${PN} += "libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5(Qt_5.0)(64bit) \
libQt5Widgets.so.5(Qt_5.1)(64bit) \
libQt5Widgets.so.5(Qt_5.10)(64bit) \
libQt5Widgets.so.5(Qt_5.11)(64bit) \
libQt5Widgets.so.5(Qt_5.12)(64bit) \
libQt5Widgets.so.5(Qt_5.13)(64bit) \
libQt5Widgets.so.5(Qt_5.14)(64bit) \
libQt5Widgets.so.5(Qt_5.15)(64bit) \
libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Widgets.so.5(Qt_5.2)(64bit) \
libQt5Widgets.so.5(Qt_5.3)(64bit) \
libQt5Widgets.so.5(Qt_5.4)(64bit) \
libQt5Widgets.so.5(Qt_5.5)(64bit) \
libQt5Widgets.so.5(Qt_5.6)(64bit) \
libQt5Widgets.so.5(Qt_5.7)(64bit) \
libQt5Widgets.so.5(Qt_5.8)(64bit) \
libQt5Widgets.so.5(Qt_5.9)(64bit) \
libQt5Widgets5 \
libQt5Widgets5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui5 \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.28)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
