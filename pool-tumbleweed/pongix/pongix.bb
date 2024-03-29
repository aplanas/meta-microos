SUMMARY = "Free Pong-like game"
DESCRIPTION = "Pongix is a free game based on the classical Pong game with \
support for net game."
LICENSE = "GPL-2.0"

PV = "0.4"

RPM_NAME = "pongix-0.4-1.28.aarch64.rpm"
RPM_HASH = "e2d3daeb268b43ca537852934d90b4c21b6d84a4622aa91c67312db159d3115753a6df1c3810b551b562fb08959df5eea8db8d9ce7da3570565b3dffb5270c1f"

RPROVIDES:${PN} += "pongix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-net-1.2.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
