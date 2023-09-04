SUMMARY = "Shared library files for non-ntk"
DESCRIPTION = "This package contains shared libraries for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "libntk1-1.3.1001-2.1.aarch64.rpm"
RPM_HASH = "50ea2d0965a411567995cdd5e2fc2b628cb0ae54e44a7289561f42aecb82f8a540d15dba55cd95f5fc3503865f6c9bff5b12f6c281cdbf90df918a633e3a68c8"

RPROVIDES:${PN} += "libntk-gl.so.1 \
libntk-images.so.1 \
libntk.so.1 \
libntk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
