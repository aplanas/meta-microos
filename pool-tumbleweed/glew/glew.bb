SUMMARY = "OpenGL Extension Wrangler Library"
DESCRIPTION = "The OpenGL Extension Wrangler Library (GLEW) is a cross-platform \
open-source C/C++ extension loading library. GLEW provides efficient \
run-time mechanisms for determining which OpenGL extensions are \
supported on the target platform. OpenGL core and extension \
functionality is exposed in a single header file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.2.0"

RPM_NAME = "glew-2.2.0-3.10.aarch64.rpm"
RPM_HASH = "808155bb3926bdc72c35d8db528cea95392b2e052add322ca450905a714c815c13f9640b4ac09801cc0d5fd7bc53dd4df0de10d3cf32bc44d5d7646ca31009ee"

RPROVIDES:${PN} += "glew \
glew(aarch-64)"

RDEPENDS:${PN} += "libGL.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
