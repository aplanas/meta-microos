SUMMARY = "Simple DirectMedia Layer 2 – Networking library"
DESCRIPTION = "This is a networking library for use with SDL."
LICENSE = "Zlib"

PV = "2.2.0"

RPM_NAME = "libSDL2_net-2_0-0-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "df3cfcb59eadc3d2a631fe18f266210622eb87f356f3ef16f056ab9257695bafa1918f6208ac95ebc78f84130d2b725054dbbda04a37a67918ebcca4f79b0c26"

RPROVIDES:${PN} += "SDL2-net \
libSDL2-net-2-0-0 \
libSDL2-net-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
