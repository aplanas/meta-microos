SUMMARY = "OpenGL Extension Wrangler Library"
DESCRIPTION = "The OpenGL Extension Wrangler Library (GLEW) is a cross-platform \
open-source C/C++ extension loading library. GLEW provides efficient \
run-time mechanisms for determining which OpenGL extensions are \
supported on the target platform. OpenGL core and extension \
functionality is exposed in a single header file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.2.0"

RPM_NAME = "glew-2.2.0-3.11.aarch64.rpm"
RPM_HASH = "93db9c6d73d93b5649addbab64cc77464810eb084654168730b014a700dce4c474fd9b46d849756276657094843173e947e1a4667a1382c5135f6e0ed327834e"

RPROVIDES:${PN} += "glew"

RDEPENDS:${PN} += "libGL.so.1 \
libGLEW.so.2.2 \
libX11.so.6 \
libc.so.6"

inherit rpm
