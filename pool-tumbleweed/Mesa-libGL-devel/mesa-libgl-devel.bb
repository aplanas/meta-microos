SUMMARY = "GL/GLX development files of the OpenGL API"
DESCRIPTION = "Mesa is a software library for 3D computer graphics that provides a \
generic OpenGL implementation for rendering three-dimensional \
graphics. \
 \
This package includes headers and static libraries for compiling \
programs with Mesa."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-libGL-devel-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "f889ff91b42fee711a4b38dab8d2341314f2aa296ba7f5f9aa5115fe2c3ea385683b7c9e3977a51b89b30ec526d12cf60f4a9f02cf7861dbc6f7df5617ca84b7"

RPROVIDES:${PN} += "Mesa-libGL-devel \
pkgconfig-gl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
