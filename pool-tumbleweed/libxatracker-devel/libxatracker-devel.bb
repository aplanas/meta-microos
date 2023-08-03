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

RPM_NAME = "libxatracker-devel-1.0.0-354.1.aarch64.rpm"
RPM_HASH = "36b91dc8e2453b7923d68cf29ad7526a8bf5e1afd66b4f7f3b72025c76a53684931d797bde0bfa96ee4b2de01a53f56c45f0c29dd9c8cb3edeb9fb5c1c2195c9"

RPROVIDES:${PN} += "libxatracker-devel \
pkgconfig-xatracker"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxatracker2"

inherit rpm
