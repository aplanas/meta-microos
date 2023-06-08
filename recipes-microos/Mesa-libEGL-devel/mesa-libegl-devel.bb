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

PV = "23.0.3"

RPM_NAME = "Mesa-libEGL-devel-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "b73f2b47d646b4c602caccc258720750bdfc7eca9afb09d55fdbe81c14d4b31806a60121c8313ac156c695c7fb13c7ed4e45908157b4bbe70476c865d3b62b29"

RPROVIDES:${PN} += "Mesa-libEGL-devel Mesa-libEGL-devel(aarch-64) pkgconfig(egl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config Mesa-KHR-devel Mesa-libEGL1 libglvnd-devel pkgconfig(x11)"

inherit rpm
