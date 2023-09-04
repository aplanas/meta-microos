SUMMARY = "CMake graphical user interface"
DESCRIPTION = "This is a Graphical User Interface for CMake, a cross-platform \
build system."
LICENSE = "BSD-3-Clause"

PV = "3.27.2"

RPM_NAME = "cmake-gui-3.27.2-1.1.aarch64.rpm"
RPM_HASH = "69cca4892000e9ebe1a13913298016bb30ad2fbe485e2673d477e09d41c829f35e53d58d154e25751d9cf9abc42163325e0f3a62f76e8e1018a60e54ebc981b4"

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
librhash.so.1 \
libstdc++.so.6 \
libuv.so.1 \
libz.so.1"

inherit rpm
