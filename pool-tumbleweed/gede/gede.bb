SUMMARY = "Qt-based GUI to GDB"
DESCRIPTION = "Gede is a graphical frontend (GUI) to GDB written in C++ and using the Qt5 toolkit. \
Gede supports debugging programs written in Ada, FreeBasic, C++, C, Rust, Fortran and Go."
LICENSE = "BSD-2-Clause"

PV = "2.18.2"

RPM_NAME = "gede-2.18.2-2.7.aarch64.rpm"
RPM_HASH = "1eed2f7e6cdbd48bb830a23cdb0eab240068020450ac773a028f57e030a4243575a126a65f6fa6b1064ca4d076d41f41ce65f59e58086f9ffad5fbaed5c7cf2d"

RPROVIDES:${PN} += "application() \
application(gede.desktop) \
gede \
gede(aarch-64)"

RDEPENDS:${PN} += "ctags \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
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
