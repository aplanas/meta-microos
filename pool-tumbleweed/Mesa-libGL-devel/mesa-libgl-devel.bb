SUMMARY = "GL/GLX development files of the OpenGL API"
DESCRIPTION = "Mesa is a software library for 3D computer graphics that provides a \
generic OpenGL implementation for rendering three-dimensional \
graphics. \
 \
This package includes headers and static libraries for compiling \
programs with Mesa."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libGL-devel-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "cc4b38f8c1769adf635146804ce3799c67fdcfd6428f7e14e13cee618631ffd61ec3b88346c27b2a35ec42b5552008d79e3dc11e24f571c9944ae5cc530ff319"

RPROVIDES:${PN} += "Mesa-libGL-devel \
pkgconfig-gl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
