SUMMARY = "GL/GLX development files of the OpenGL API"
DESCRIPTION = "Mesa is a software library for 3D computer graphics that provides a \
generic OpenGL implementation for rendering three-dimensional \
graphics. \
 \
This package includes headers and static libraries for compiling \
programs with Mesa."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-libGL-devel-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "fdf27d0486bfae36f80bba88ed528a0cb9ac37749de9b6762428671974953703138609c11633bb96a27276161e79e4db4974e77ef4515b9a209660e1530ae29d"

RPROVIDES:${PN} += "Mesa-libGL-devel \
pkgconfig-gl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
