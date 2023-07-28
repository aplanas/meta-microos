SUMMARY = "Library for sharpening YUV option in WebP"
DESCRIPTION = "Library that provides the sharpening YUV option for better WebP images."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libsharpyuv0-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "c49e87ab0caa0d2b3d8bf8a97cbac7536ea49e78c429d15532b058e830901c658d4e98a0233490b8e0a000730f031fbb9b2990f751164efec7d4cb2690901073"

RPROVIDES:${PN} += "libsharpyuv.so.0 \
libsharpyuv0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
