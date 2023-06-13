SUMMARY = "Development files for quazip-qt5"
DESCRIPTION = "The quazip-qt5-devel package contains libraries and header files for \
developing applications that use quazip."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "quazip-qt5-devel-1.4-2.3.aarch64.rpm"
RPM_HASH = "deee622378c8e4b77b5097ad5b31274e86a51abce11b8baade843f941dbc429816ff6932c6d452be93d0c92c4b048087bcfde4e1f004992ec2c9a74202acd17e"

RPROVIDES:${PN} += "cmake(QuaZip-Qt5) \
libquazip-qt5-devel \
pkgconfig(quazip1-qt5) \
quazip-devel \
quazip-qt5-devel \
quazip-qt5-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt5Core) \
libquazip1-qt5-1_4_0 \
pkgconfig(Qt5Core) \
pkgconfig(bzip2) \
pkgconfig(zlib)"

inherit rpm
