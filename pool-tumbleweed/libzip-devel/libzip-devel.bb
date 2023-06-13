SUMMARY = "C library for reading, creating, and modifying zip archives"
DESCRIPTION = "libzip is a C library for reading, creating, and modifying zip \
archives. This package contains devel files."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "libzip-devel-1.9.2-1.5.aarch64.rpm"
RPM_HASH = "fc5de8524e46192185b463a593a8d917c2c5277d4b292cef3c5b2c7089f2cdb76ec85d4a91ffa5d7db25b87cc35e826cdc3ea4c1e0e09ad8c3d4f6bd3cec3944"

RPROVIDES:${PN} += "cmake(libzip) \
libzip-devel \
libzip-devel(aarch-64) \
pkgconfig(libzip)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libzip5"

inherit rpm
