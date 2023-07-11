SUMMARY = "Development files for quazip-qt5"
DESCRIPTION = "The quazip-qt5-devel package contains libraries and header files for \
developing applications that use quazip."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "quazip-qt5-devel-1.4-2.4.aarch64.rpm"
RPM_HASH = "5447ef89b25ca8876ee960516201ccd83a7c575527bb28bf820630f9a4a721de8a65bf2ca7f34ed979c4215bcffa37c51efae48213eeea4fb63e3f30e4e66997"

RPROVIDES:${PN} += "cmake-QuaZip-Qt5 \
libquazip-qt5-devel \
pkgconfig-quazip1-qt5 \
quazip-devel \
quazip-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
libquazip1-qt5-1-4-0 \
pkgconfig-Qt5Core \
pkgconfig-bzip2 \
pkgconfig-zlib"

inherit rpm
