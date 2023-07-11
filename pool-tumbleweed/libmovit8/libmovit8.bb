SUMMARY = "GPU video filter library"
DESCRIPTION = "Movit is a library for video filters. It uses the GPU present in many \
computers to accelerate computation of common filters and \
transitions, facilitating real-time HD video editing. \
 \
This package contains the Movit shared library."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.3"

RPM_NAME = "libmovit8-1.6.3-1.16.aarch64.rpm"
RPM_HASH = "4575616c5677548b960874b917188d75e9251a87c27609c8fa8c6e1a82c8343abb46f300f7231db2a2e701a39a217e4701b16ff9e8da1c3d46d4f307637546f7"

RPROVIDES:${PN} += "libmovit.so.8 \
libmovit8 \
movit"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
movit8-data"

inherit rpm
