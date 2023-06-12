SUMMARY = "Qt 6 Widgets library"
DESCRIPTION = "The Qt Widgets library provides a set of UI elements to create classic \
desktop-style user interfaces."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Widgets6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4ccdcf8b6c5102129e523a09e79ca3d4d7e489cf3a069e17a05c8bd5cc72706bbceb8413c50717c9d20f718fd143055822547f47c7057f99fc299d1d65f3823d"

RPROVIDES:${PN} += "libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6(Qt_6.0)(64bit) \
libQt6Widgets.so.6(Qt_6.1)(64bit) \
libQt6Widgets.so.6(Qt_6.2)(64bit) \
libQt6Widgets.so.6(Qt_6.3)(64bit) \
libQt6Widgets.so.6(Qt_6.4)(64bit) \
libQt6Widgets.so.6(Qt_6.5)(64bit) \
libQt6Widgets.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Widgets6 \
libQt6Widgets6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Gui6 \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.28)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
