SUMMARY = "Development files for occt"
DESCRIPTION = "This package contains the files needed for development with OpenCASCADE."
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "occt-devel-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "4fcd12a3ff4ea1ae5d9b2a7615c46de1c848aa1b8b05f4ea197f597956c9db14e01040e6e2d6f7eaa9443da6577fd4033e002daad693f5c2dc7bbd0599266b30"

RPROVIDES:${PN} += "OpenCASCADE-devel \
cmake-OpenCASCADE \
occt-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libTKExpress.so.7.7 \
libTKernel.so.7.7 \
libc.so.6 \
libgcc-s.so.1 \
libopencascade-applicationframework7-7 \
libopencascade-dataexchange7-7 \
libopencascade-draw7-7 \
libopencascade-foundationclasses7-7 \
libopencascade-modelingalgorithms7-7 \
libopencascade-modelingdata7-7 \
libopencascade-visualization7-7 \
libstdc++.so.6 \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-xext \
pkgconfig-xmu \
tcl-devel \
tk-devel"

inherit rpm
