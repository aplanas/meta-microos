SUMMARY = "Debugging tools for Widelands"
DESCRIPTION = "Additional debugging data for Widelands. This package is not needed for normal \
operation."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "widelands-debug-1.1-3.2.aarch64.rpm"
RPM_HASH = "69a1ffcfcc3d87744c34fe997dd75fe4acd38032e0a210433986fda71bd18849c78620e94358da1b744ebd713e370b3c07427a77d3f684b919dc76537e9792bf"

RPROVIDES:${PN} += "widelands-debug"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLEW.so.2.2 \
libGLX.so.0 \
libOpenGL.so.0 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
