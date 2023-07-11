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

RPM_NAME = "libxatracker-devel-1.0.0-353.1.aarch64.rpm"
RPM_HASH = "bff708964c4bb9b06d0a4db6e3112dd1372d71764c7a64eb0029d0e3c9b524a526cf09570cd1bb9cf3074012f952f71abb6a434d3b0bae356363ba074c728816"

RPROVIDES:${PN} += "libxatracker-devel \
pkgconfig-xatracker"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxatracker2"

inherit rpm
