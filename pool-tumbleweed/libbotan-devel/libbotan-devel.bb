SUMMARY = "Development files for Botan"
DESCRIPTION = "This package contains the header files and libraries needed to develop \
programs that use the Botan library."
LICENSE = "BSD-2-Clause"

PV = "2.19.3"

RPM_NAME = "libbotan-devel-2.19.3-1.6.aarch64.rpm"
RPM_HASH = "101ec84d2dba97375d44573a0809c6fa3e68154290541275280b73bbdf3dba81280569e6ac451fb996bd5ef4a42c697e05fa6a182962d44b77ef61f0a098536b"

RPROVIDES:${PN} += "Botan-devel \
libbotan-devel \
pkgconfig-botan-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbotan-2-19 \
libbz2-devel \
pkgconfig-liblzma \
pkgconfig-sqlite3 \
trousers-devel"

inherit rpm
