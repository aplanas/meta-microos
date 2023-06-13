SUMMARY = "Development files for occt"
DESCRIPTION = "This package contains the files needed for development with OpenCASCADE."
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "occt-devel-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "4fcd12a3ff4ea1ae5d9b2a7615c46de1c848aa1b8b05f4ea197f597956c9db14e01040e6e2d6f7eaa9443da6577fd4033e002daad693f5c2dc7bbd0599266b30"

RPROVIDES:${PN} += "OpenCASCADE-devel \
cmake(OpenCASCADE) \
occt-devel \
occt-devel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libTKExpress.so.7.7()(64bit) \
libTKernel.so.7.7()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libopencascade-applicationframework7_7 \
libopencascade-dataexchange7_7 \
libopencascade-draw7_7 \
libopencascade-foundationclasses7_7 \
libopencascade-modelingalgorithms7_7 \
libopencascade-modelingdata7_7 \
libopencascade-visualization7_7 \
libstdc++.so.6()(64bit) \
pkgconfig(freetype2) \
pkgconfig(gl) \
pkgconfig(xext) \
pkgconfig(xmu) \
tcl-devel \
tk-devel"

inherit rpm
