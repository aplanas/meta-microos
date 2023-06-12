SUMMARY = "Commandline Tools for Tiled MapEditor"
DESCRIPTION = "This package contains tmxviewer, a simple application to view Tiled maps \
and tmxrasterizer which is also a command line tool."
LICENSE = "BSD-2-Clause"

PV = "1.10.1"

RPM_NAME = "tmxtools-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "3743042eac0d16bed3ec1a7b8c117ec0c7e3dba563040fd2c64a9b913d982be69c3a48dc5611e7f66e097eafda3caefef1698ca509a78bc75fef2b9ca7cf8e11"

RPROVIDES:${PN} += "tmxtools \
tmxtools(aarch-64)"
RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.4)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libtiled.so()(64bit)"

inherit rpm