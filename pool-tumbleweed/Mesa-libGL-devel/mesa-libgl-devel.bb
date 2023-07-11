SUMMARY = "GL/GLX development files of the OpenGL API"
DESCRIPTION = "Mesa is a software library for 3D computer graphics that provides a \
generic OpenGL implementation for rendering three-dimensional \
graphics. \
 \
This package includes headers and static libraries for compiling \
programs with Mesa."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-libGL-devel-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "5b9e4738a2c448f0d2dc1dbc2108057c1b327369b9525e6ff05e2b54ffa81c2eb9acb33f1d8df7189f85af5927d2fcc9b672d0de8dd45ef0821d1d9e6422cae4"

RPROVIDES:${PN} += "Mesa-libGL-devel \
pkgconfig-gl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
