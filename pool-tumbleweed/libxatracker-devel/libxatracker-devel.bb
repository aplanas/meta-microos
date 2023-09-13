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

RPM_NAME = "libxatracker-devel-1.0.0-357.1.aarch64.rpm"
RPM_HASH = "960039956b67af11d89e2e27084282874c04fd9156afe30ec1d92e6da8ccd89902030712d87c7ea2ffb6232d7a4de35864fe13c8d87d0ad834d9ac92ba23de2c"

RPROVIDES:${PN} += "libxatracker-devel \
pkgconfig-xatracker"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxatracker2"

inherit rpm
