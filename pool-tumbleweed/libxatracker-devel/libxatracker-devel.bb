SUMMARY = "Development files for the XA API"
DESCRIPTION = "This package contains the XA state tracker for gallium3D driver. \
It superseeds the Xorg state tracker and provides an infrastructure \
to accelerate Xorg 2D operations. It is currently used by vmwgfx \
video driver. \
 \
This package provides the development environment for compiling \
programs against the XA state tracker."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libxatracker-devel-1.0.0-349.2.aarch64.rpm"
RPM_HASH = "39d9ed28474c7a93f9281e5c6b10258574566b527ada4345d8cd9a3c45cce28268564a6437f7463a2bd0d6753dbd6402beeb4f940008ade8e07c8a575982044c"

RPROVIDES:${PN} += "libxatracker-devel \
libxatracker-devel(aarch-64) \
pkgconfig(xatracker)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxatracker2"

inherit rpm
