SUMMARY = "GL/GLX development files of the OpenGL API"
DESCRIPTION = "Mesa is a software library for 3D computer graphics that provides a \
generic OpenGL implementation for rendering three-dimensional \
graphics. \
 \
This package includes headers and static libraries for compiling \
programs with Mesa."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-libGL-devel-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "915d07543ce47c0487094fce9a7e8a7c0e75f375298cbff40a08605084dacb9d40978c7914216cca01c3666c01064634305c9f296a4b6824be6dcde8a6e478ac"

RPROVIDES:${PN} += "Mesa-libGL-devel \
pkgconfig-gl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
