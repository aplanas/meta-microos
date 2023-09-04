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

PV = "23.1.5"

RPM_NAME = "Mesa-libEGL-devel-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "b3063caddc606d5a791152e4f043c0162f09a4bdef4912c27820fe197ddceaa97c556747df3c848a1e02fd8129e6647f28e07fbf2097660af2af66442fef7863"

RPROVIDES:${PN} += "Mesa-libEGL-devel \
pkgconfig-egl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libEGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
