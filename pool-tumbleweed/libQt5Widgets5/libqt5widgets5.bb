SUMMARY = "Qt 5 Widgets Library"
DESCRIPTION = "The Qt Widgets Module provides a set of UI elements to create classic \
desktop-style user interfaces."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Widgets5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "9442d39a44e3af62f0e56016db7ebbfe4ca3913f22768ea805211006802be23542753aeefe184bdad930e8466f0517264667b5b9350e7cd9347e7ef989b65729"

RPROVIDES:${PN} += "libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Widgets5 \
libQt5Widgets5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui5 \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
