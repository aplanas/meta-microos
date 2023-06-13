SUMMARY = "CMake graphical user interface"
DESCRIPTION = "This is a Graphical User Interface for CMake, a cross-platform \
build system."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-gui-3.26.4-1.1.aarch64.rpm"
RPM_HASH = "c4656c78d5b06b1b0b56c6ee6da0f519c9346b60357bafd5ad79518f39e13ddfb1fe2289e435661f9b72e57132015334992649bf2c2c959308fbe2e2927ebbd4"

RPROVIDES:${PN} += "application() \
application(cmake-gui.desktop) \
cmake-gui \
cmake-gui(aarch-64) \
mimehandler(application/x-cmakecache)"

RDEPENDS:${PN} += "cmake \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libjsoncpp.so.25()(64bit) \
libm.so.6()(64bit) \
librhash.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libuv.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
