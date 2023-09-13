SUMMARY = "Development files for the EGL API"
DESCRIPTION = "This package contains the development environment required for \
compiling programs against EGL native platform graphics interface \
library. EGL provides a platform-agnostic mechanism for creating \
rendering surfaces for use with other graphics libraries, such as \
OpenGL|ES and OpenVG. \
 \
This package provides the development environment for compiling \
programs against the EGL library."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-libEGL-devel-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "e774c28f1fb7b10019d0680df18717e71ec4a66f332fe33f041472bd09e5f7d95d211314a7e00288f42b2822c7785b62f474d82d8dde30483c0493cb380b77b4"

RPROVIDES:${PN} += "Mesa-libEGL-devel \
pkgconfig-egl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libEGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
