SUMMARY = "Development files for occt"
DESCRIPTION = "This package contains the files needed for development with OpenCASCADE."
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "occt-devel-7.7.0-1.4.aarch64.rpm"
RPM_HASH = "d93a29bc92887d3713d13d9a8b57e38008ef0b66d708fbc706dfeb3dd70cee7430d3112c9374f54287bdba02639b15ba5cae2b9b4a00feea51b9193fa1f21e9d"

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
