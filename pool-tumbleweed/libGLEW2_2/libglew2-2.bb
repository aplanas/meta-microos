SUMMARY = "OpenGL Extension Wrangler Library"
DESCRIPTION = "The OpenGL Extension Wrangler Library (GLEW) is a cross-platform \
open-source C/C++ extension loading library. GLEW provides efficient \
run-time mechanisms for determining which OpenGL extensions are \
supported on the target platform. OpenGL core and extension \
functionality is exposed in a single header file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.2.0"

RPM_NAME = "libGLEW2_2-2.2.0-3.11.aarch64.rpm"
RPM_HASH = "67fa727c6b82bfca057675a23b9612c67ded04a8127d10735f394d7de0aa4d6ae55cf852eeace2322a78caab52ea96438b96658c15983a8c008b157d9ce00b2c"

RPROVIDES:${PN} += "libGLEW.so.2.2 \
libGLEW2-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libGL.so.1 \
libc.so.6"

inherit rpm
