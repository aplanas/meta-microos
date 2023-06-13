SUMMARY = "Development files for the minizip library"
DESCRIPTION = "This package contains the libraries and header files needed for \
developing applications which use minizip."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "minizip-devel-1.2.13-4.1.aarch64.rpm"
RPM_HASH = "631ee5a210143a7c0ae39dfe0585d681ef3c90e20ce277e9ffb0ea732f9f3e515eb38c61c510cbbc7d820cff37a5195d30edc0f946187a5d78d1ce8815d84fbc"

RPROVIDES:${PN} += "minizip-devel \
minizip-devel(aarch-64) \
pkgconfig(minizip)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libminizip1 \
pkgconfig \
zlib-devel"

inherit rpm
