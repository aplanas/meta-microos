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

PV = "23.1.4"

RPM_NAME = "Mesa-libEGL-devel-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "0d3904a7c816e6fd4f7b77455acf57831401be7936384e7bfa0b47069238fcebd1e3ba1566b7bb33dd35803feeeeaf76b8b7fe2e4044f1449a3f045ba679d246"

RPROVIDES:${PN} += "Mesa-libEGL-devel \
pkgconfig-egl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libEGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
