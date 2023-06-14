SUMMARY = "SDL extension library of the Fifechan GUI toolkit"
DESCRIPTION = "SDL extension for the fifechan library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "libfifechan_sdl0_1_5-0.1.5-1.19.aarch64.rpm"
RPM_HASH = "d6bb70106f791c44588b19103106eae46a197025c4b01c9d989283ff9af61a3c8a26e87ccb08d896a207a9794a47f58f34ed6f3699926b6650d18d98b527cf1d"

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
