SUMMARY = "Development files for quazip-qt6"
DESCRIPTION = "The quazip-qt6-devel package contains libraries and header files for \
developing applications that use quazip."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "quazip-qt6-devel-1.4-2.3.aarch64.rpm"
RPM_HASH = "bfd3e903d8250d37d326b9db1bb5b2f1a2659b5d08ff6aea22772f9d220b3857e4dedd7830a6bd4fae257c63d4fb233eab899ef59cac930cad675b35b0cf3420"

RPROVIDES:${PN} += "cmake(QuaZip-Qt6) \
pkgconfig(quazip1-qt6) \
quazip-qt6-devel \
quazip-qt6-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Core) \
cmake(Qt6Core5Compat) \
libquazip1-qt6-1_4_0 \
pkgconfig(Qt6Core) \
pkgconfig(bzip2) \
pkgconfig(zlib)"

inherit rpm
