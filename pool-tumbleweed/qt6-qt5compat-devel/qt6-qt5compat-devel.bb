SUMMARY = "Qt 6 Core 5 Compat library - Development files"
DESCRIPTION = "Development files for the Qt 6 Core 5 Compat library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f00cfa70d4eb6b8e15b53e4eb2364e3f3816ac3f8e4f2b55e20a01847540a28551095c5fdf9cca784016f2a82a0b6ba7a50232ebc9039fc91253ec84e7663155"

RPROVIDES:${PN} += "cmake(Qt6Core5Compat) \
pkgconfig(Qt6Core5Compat) \
qt6-qt5compat-devel \
qt6-qt5compat-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Core5Compat6 \
pkgconfig(Qt6Core) \
qt6-core-private-devel"

inherit rpm
