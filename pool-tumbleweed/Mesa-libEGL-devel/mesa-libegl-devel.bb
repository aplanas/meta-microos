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

PV = "23.1.6"

RPM_NAME = "Mesa-libEGL-devel-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "bd1f7b7fe67cd1625773416da893ec6000c90329d04982a9c84a72d80a825dfccac4c1b123854f421457f2bb2663fd5562242c46389afe5257b3a94d53a6bed5"

RPROVIDES:${PN} += "Mesa-libEGL-devel \
pkgconfig-egl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libEGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
