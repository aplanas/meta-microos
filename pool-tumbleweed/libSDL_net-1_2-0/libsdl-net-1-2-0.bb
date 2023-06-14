SUMMARY = "Simple DirectMedia Layer – Networking library"
DESCRIPTION = "This is a small cross-platform networking library for use with SDL."
LICENSE = "LGPL-2.1+"

PV = "1.2.8"

RPM_NAME = "libSDL_net-1_2-0-1.2.8-7.26.aarch64.rpm"
RPM_HASH = "cc978718c5f4940ac7b192343a3e4db4deb9c3e171636f0c2deddcbad621828c4f34d01cfaf0e364b5372970fdf3c0e1061403c6bfc344144f438c268b9515c1"

RPROVIDES:${PN} += "SDL-net \
libSDL-net-1-2-0 \
libSDL-net-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6"

inherit rpm
