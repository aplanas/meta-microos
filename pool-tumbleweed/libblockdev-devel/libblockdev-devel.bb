SUMMARY = "Development files for the LibBlockDev library"
DESCRIPTION = "This package provides header files, pkg-config modules and API documentation needed for \
development with the LibBlockDev library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libblockdev-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "6629246b9f5fadfa41ec1840e25c1aadf7cb69d1ec67d6f258bead18f71d0c0562d058dcc56c4a5597e5f6e9218cbb9c9d09dfca9351ea140431ee1c2846db58"

RPROVIDES:${PN} += "libblockdev-devel \
pkgconfig-blockdev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libblockdev2 \
pkgconfig-glib-2.0"

inherit rpm
