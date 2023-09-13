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

PV = "23.1.7"

RPM_NAME = "libgbm-devel-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "26954d57fb21cbcbf0d799e4a7ad6c664e05ef7a34f4e7cab4c12526538a41016baa1eb33c86644e05d59b096f4debf1c1e0e5c9efe360b899e6f7554a4e8f0a"

RPROVIDES:${PN} += "libgbm-devel \
pkgconfig-gbm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgbm1"

inherit rpm
