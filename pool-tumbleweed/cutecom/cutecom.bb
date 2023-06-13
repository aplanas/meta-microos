SUMMARY = "A graphical serial terminal"
DESCRIPTION = "CuteCom is a graphical serial terminal, similar to minicom. It is \
written using the Qt library. \
 \
It is aimed mainly at hardware developers or other people who need a \
terminal to talk to their devices."
LICENSE = "GPL-3.0-or-later"

PV = "0.51.0"

RPM_NAME = "cutecom-0.51.0-2.15.aarch64.rpm"
RPM_HASH = "827f8613b2139be7dd1016b40a5d098518689a714ba9e353e4d4b0274392fa08ade2c93a474dd560f501f2b6a74208bafefd84f85860d4b29ac20aa0536b843e"

RPROVIDES:${PN} += "application() \
application(cutecom.desktop) \
cutecom \
cutecom(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5SerialPort.so.5()(64bit) \
libQt5SerialPort.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
