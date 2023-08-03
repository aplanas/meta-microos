SUMMARY = "Development files for libdw"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libdw."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdw-devel-0.189-4.1.aarch64.rpm"
RPM_HASH = "0161a85e53bd2e411ed4a015585fa83d5dd8d744de6b952af8643a6cd72beadf48233db03edf6ff43cf8eb1687bcff384ce8598179524bc9664463ab591dc500"

RPROVIDES:${PN} += "libdw-devel \
pkgconfig-libdw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libdw1 \
libelf-devel \
pkgconfig-libelf \
pkgconfig-liblzma \
pkgconfig-libzstd \
pkgconfig-zlib"

inherit rpm
