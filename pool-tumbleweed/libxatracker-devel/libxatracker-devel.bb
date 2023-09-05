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

RPM_NAME = "libxatracker-devel-1.0.0-356.1.aarch64.rpm"
RPM_HASH = "dbc488748c6cc7a12dd1b272feaa0d802158f2d8c6fa656e2874cc84f276946aa9a7e3c4db5af0516ba613a61c5be39eee5bc2526d894861904916925498abaf"

RPROVIDES:${PN} += "libxatracker-devel \
pkgconfig-xatracker"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxatracker2"

inherit rpm
