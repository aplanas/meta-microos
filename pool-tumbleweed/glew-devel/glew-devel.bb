SUMMARY = "Development files for glew"
DESCRIPTION = "The OpenGL Extension Wrangler Library (GLEW) is a cross-platform \
open-source C/C++ extension loading library. GLEW provides efficient \
run-time mechanisms for determining which OpenGL extensions are \
supported on the target platform. OpenGL core and extension \
functionality is exposed in a single header file."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.2.0"

RPM_NAME = "glew-devel-2.2.0-3.11.aarch64.rpm"
RPM_HASH = "3a685b62ac965f5fca46814bc9ec8c08b94795cf04a72a1499e3e6a40e129f1bf7734513aee8fece69a269b793e36a54dac57c67cea8d39c8c7bb0c47ce9570e"

RPROVIDES:${PN} += "glew-devel \
pkgconfig-glew"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libGLEW2-2 \
pkgconfig-egl \
pkgconfig-glu \
pkgconfig-x11 \
pkgconfig-xproto"

inherit rpm
