SUMMARY = "A video processing framework"
DESCRIPTION = "VapourSynth's core library with a C++ API."
LICENSE = "LGPL-2.1-only"

PV = "62"

RPM_NAME = "libvapoursynth-62-62-1.2.aarch64.rpm"
RPM_HASH = "33d6a5acf1dd478158eea90a1ad21f7b244a1c5b6b1642b8d01ccc03da9a5645892f02a24a5f45eda25eab2bce0f6891102dc2d4e08b0e0d0ede138ef86990bd"

RPROVIDES:${PN} += "libvapoursynth-62 \
libvapoursynth-62.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libzimg.so.2"

inherit rpm
