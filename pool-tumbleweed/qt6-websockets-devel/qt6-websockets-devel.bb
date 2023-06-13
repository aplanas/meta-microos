SUMMARY = "Qt 6 WebSockets library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebSockets library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-websockets-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "76373d642887d9e1c191464024139a1cd1ee5bac46b7b78c5b54250d9c1c40d1b284d12246c5971d97c14bd81780e16afc03cc7aedcd56218cdca80bd9eb4701"

RPROVIDES:${PN} += "cmake(Qt6WebSockets) \
pkgconfig(Qt6WebSockets) \
qt6-websockets-devel \
qt6-websockets-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Network) \
libQt6WebSockets6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Network)"

inherit rpm
