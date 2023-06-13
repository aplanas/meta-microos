SUMMARY = "A handy alarm clock Program written in QT"
DESCRIPTION = "A handy alarm clock Program written in QT. \
Features: \
 * Up to 15 Customization alarms \
 * Can wake up using the default sound, or any of audio / video \
   file of your choosing. \
 * Custom Date alarms"
LICENSE = "GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "QTalarm-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "a134a6fe2aea9ebb627b06bf7afabd6710d1d0b8b5f1f077bea5db9333dd66ceebe3e0a019d02fd199d654f2646904ca595ef2f26b1bb3f8c87b5ec98fd27b8b"

RPROVIDES:${PN} += "QTalarm \
QTalarm(aarch-64) \
application() \
application(qtalarm.desktop)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
