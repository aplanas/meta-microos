SUMMARY = "CMake graphical user interface"
DESCRIPTION = "This is a Graphical User Interface for CMake, a cross-platform \
build system."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-gui-3.26.4-3.1.aarch64.rpm"
RPM_HASH = "5dca61149419b5ddfc7ecb8a71226bc052bdfac5b213538be5bb2e535314c15e13f3395c7761116ddf44dd674eaaee8f38f663395c6ea40273d5d3afdfa7e65c"

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
