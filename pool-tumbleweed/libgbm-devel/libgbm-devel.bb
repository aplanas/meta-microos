SUMMARY = "Development files for the EGL API"
DESCRIPTION = "This package contains the GBM buffer management library. It provides \
a mechanism for allocating buffers for graphics rendering tied to \
Mesa. \
 \
GBM is intended to be used as a native platform for EGL on drm or \
openwfd. \
 \
This package provides the development environment for compiling \
programs against the GBM library."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "libgbm-devel-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "2ff3934f4bde73061ab20ae48f8497178aaa9be3bfe1be8cc4f7eb8015f5c8b011d2a45f1871890e784aa94ca5aff7ea757d95c28f7fdf1e3d7ba9fda06d3fb4"

RPROVIDES:${PN} += "libgbm-devel \
pkgconfig-gbm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgbm1"

inherit rpm
