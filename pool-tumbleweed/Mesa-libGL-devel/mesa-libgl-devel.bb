SUMMARY = "GL/GLX development files of the OpenGL API"
DESCRIPTION = "Mesa is a software library for 3D computer graphics that provides a \
generic OpenGL implementation for rendering three-dimensional \
graphics. \
 \
This package includes headers and static libraries for compiling \
programs with Mesa."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-libGL-devel-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "4000b910c52cc39e9f14123a6bd9b1056a594952e601b4d15e2b1a987ab128e5c9ee08a8541f6c2e6d045d3ac2876d7c573cc8c8384769f6c30e873c314c8f5b"

RPROVIDES:${PN} += "Mesa-libGL-devel \
pkgconfig-gl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
