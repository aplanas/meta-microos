SUMMARY = "GPU video filter library"
DESCRIPTION = "Movit is a library for video filters. It uses the GPU present in many \
computers to accelerate computation of common filters and \
transitions, facilitating real-time HD video editing. \
 \
This package contains the Movit shared library."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libmovit8-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "5e6610c8f42e5f4f2ab1e8e9cf80a65374f3303a9fd29766d7b8942d6af7dac0a1b26a706c2236700a2c8cbacc590ac8ee3445136db974daee30b105c01774bf"

RPROVIDES:${PN} += "libmovit.so.8 \
libmovit8 \
movit \
movit8-data"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
