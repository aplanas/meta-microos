SUMMARY = "A video processing framework"
DESCRIPTION = "VapourSynth's core library with a C++ API."
LICENSE = "LGPL-2.1-only"

PV = "63"

RPM_NAME = "libvapoursynth-63-63-1.1.aarch64.rpm"
RPM_HASH = "73b996d5646bba02361fd6dd88deee3380a6cd930fbcf38b1139cb1d93d3f353c834e9fa064ffba6dde9915112d5ee6b72bdd6db86ec3ebbf47acde8baea67d9"

RPROVIDES:${PN} += "libvapoursynth-63 \
libvapoursynth-63.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libzimg.so.2"

inherit rpm
