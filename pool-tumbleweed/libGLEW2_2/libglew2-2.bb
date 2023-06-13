SUMMARY = "OpenGL Extension Wrangler Library"
DESCRIPTION = "The OpenGL Extension Wrangler Library (GLEW) is a cross-platform \
open-source C/C++ extension loading library. GLEW provides efficient \
run-time mechanisms for determining which OpenGL extensions are \
supported on the target platform. OpenGL core and extension \
functionality is exposed in a single header file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.2.0"

RPM_NAME = "libGLEW2_2-2.2.0-3.10.aarch64.rpm"
RPM_HASH = "191a5b7349aaf53ae53d842d14fa859c826b879cb0e0cdf13081db7e85249da7d44210c8a019c1f98f77c37b5867e95a50b5ec956754010c56148ab1e3b2ce19"

RPROVIDES:${PN} += "libGLEW.so.2.2()(64bit) \
libGLEW2_2 \
libGLEW2_2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libGL.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
