SUMMARY = "Header files and documentation for libstorage-ng"
DESCRIPTION = "This package contains header files and documentation for developing with \
libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.127"

RPM_NAME = "libstorage-ng-devel-4.5.127-1.1.aarch64.rpm"
RPM_HASH = "20ac5cb4b8604a1dcad1c3318821f6fb0db5ea4892d649587c03f9a5376266bdd3e5af745cd90003b76451296337a21841793d4fbd45d52e9245b0e2c22fca38"

RPROVIDES:${PN} += "libstorage-ng-devel"

RDEPENDS:${PN} += "gcc-c++ \
libstdc++-devel \
libstorage-ng1 \
pkgconfig \
pkgconfig-libxml-2.0"

inherit rpm
