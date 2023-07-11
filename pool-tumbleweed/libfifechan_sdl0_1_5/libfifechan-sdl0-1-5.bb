SUMMARY = "SDL extension library of the Fifechan GUI toolkit"
DESCRIPTION = "SDL extension for the fifechan library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "libfifechan_sdl0_1_5-0.1.5-1.20.aarch64.rpm"
RPM_HASH = "19564818bc0328ee425e8b54939678d52a916e4199b5304565df36766d91b3dfa85ad9414487a27005ae3bbd788245048a4067f12141794728260285059d5447"

RPROVIDES:${PN} += "libfifechan-sdl.so.0.1.5 \
libfifechan-sdl0-1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libc.so.6 \
libfifechan.so.0.1.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
