SUMMARY = "CMake graphical user interface"
DESCRIPTION = "This is a Graphical User Interface for CMake, a cross-platform \
build system."
LICENSE = "BSD-3-Clause"

PV = "3.27.1"

RPM_NAME = "cmake-gui-3.27.1-1.2.aarch64.rpm"
RPM_HASH = "4ebe6b7206a46ea8f832a3dafe10422fcac423faebd078d2e001368fdb1130802facde2a5d422a0a56c1f3424277af3e0ec434d572b5a0b695360d8bf322bfcb"

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
