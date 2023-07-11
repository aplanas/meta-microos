SUMMARY = "Development files for quazip-qt6"
DESCRIPTION = "The quazip-qt6-devel package contains libraries and header files for \
developing applications that use quazip."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "quazip-qt6-devel-1.4-2.4.aarch64.rpm"
RPM_HASH = "131ed1d3811b3b908bb3367a03fe46efb7538b5bfb296785e3b11fb72515a6fed8d2b62f5822cc5af311f4cd99667acc9f1885d2d771539aaf3fbf54ac99f380"

RPROVIDES:${PN} += "cmake-QuaZip-Qt6 \
pkgconfig-quazip1-qt6 \
quazip-qt6-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Core5Compat \
libquazip1-qt6-1-4-0 \
pkgconfig-Qt6Core \
pkgconfig-bzip2 \
pkgconfig-zlib"

inherit rpm
