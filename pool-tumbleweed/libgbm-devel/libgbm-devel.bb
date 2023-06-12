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

PV = "23.0.3"

RPM_NAME = "libgbm-devel-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "0daf6c68a6b8cc089159df03c3cf2f00e6fea2c2404e5b493192e01eb80aff9b9da0ab85c91dc0c3a6d04830252d5ef90855870f0a8fddb814aa4d2530f08c47"

RPROVIDES:${PN} += "libgbm-devel \
libgbm-devel(aarch-64) \
pkgconfig(gbm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgbm1"

inherit rpm
