SUMMARY = "Development files for the minizip library"
DESCRIPTION = "This package contains the libraries and header files needed for \
developing applications which use minizip."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "minizip-devel-1.2.13-4.2.aarch64.rpm"
RPM_HASH = "4a306fa70673c72e6078e5ee1d2f3f282e7f67e05d737811b0e8c1e56af3831ec640bd4661a7a6a89e720d5e20e5686cdc4c45c129188249f804e926a317826c"

RPROVIDES:${PN} += "minizip-devel \
pkgconfig-minizip"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libminizip1 \
pkgconfig \
zlib-devel"

inherit rpm
