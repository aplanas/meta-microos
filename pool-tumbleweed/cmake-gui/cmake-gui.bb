SUMMARY = "CMake graphical user interface"
DESCRIPTION = "This is a Graphical User Interface for CMake, a cross-platform \
build system."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-gui-3.26.4-1.1.aarch64.rpm"
RPM_HASH = "c4656c78d5b06b1b0b56c6ee6da0f519c9346b60357bafd5ad79518f39e13ddfb1fe2289e435661f9b72e57132015334992649bf2c2c959308fbe2e2927ebbd4"

RPROVIDES:${PN} += "cmake-gui"

RDEPENDS:${PN} += "cmake \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libm.so.6 \
librhash.so.0 \
libstdc++.so.6 \
libuv.so.1 \
libz.so.1"

inherit rpm
