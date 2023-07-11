SUMMARY = "Shared library files for non-ntk"
DESCRIPTION = "This package contains shared libraries for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "libntk1-1.3.1001-1.7.aarch64.rpm"
RPM_HASH = "cb027a8abcdd48ae79aa8bb489604bb67b8b41879fbc775913fb695a80c033cf45b28f8cc9b7d12ba8bfb1046e813496cfe5ca6772807b3fd6d338717afa6123"

RPROVIDES:${PN} += "libntk-gl.so.1 \
libntk-images.so.1 \
libntk.so.1 \
libntk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
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
