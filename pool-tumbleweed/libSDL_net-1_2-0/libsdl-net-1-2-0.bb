SUMMARY = "Simple DirectMedia Layer – Networking library"
DESCRIPTION = "This is a small cross-platform networking library for use with SDL."
LICENSE = "LGPL-2.1+"

PV = "1.2.8"

RPM_NAME = "libSDL_net-1_2-0-1.2.8-7.27.aarch64.rpm"
RPM_HASH = "6cb2c926da81f7a70cd3e80f1182bdb4749f472207ccfbe9e732f027eeca3971eafb47b2ea4dd2af64c94fdd20e2b6a27869ee04adec6fcbecf49b59804ad953"

RPROVIDES:${PN} += "SDL-net \
libSDL-net-1-2-0 \
libSDL-net-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6"

inherit rpm
