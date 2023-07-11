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

PV = "23.1.3"

RPM_NAME = "Mesa-libEGL-devel-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "3264f8b6b504b8f368b9607cd2676a1117c08169c5b648d0fa7de6a18a874d00bc697302059ef88fa98fe3e6dfd41ae2235d86d6a30f6010d3a34f49d1ff629c"

RPROVIDES:${PN} += "Mesa-libEGL-devel \
pkgconfig-egl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
Mesa-libEGL1 \
libglvnd-devel \
pkgconfig-x11"

inherit rpm
