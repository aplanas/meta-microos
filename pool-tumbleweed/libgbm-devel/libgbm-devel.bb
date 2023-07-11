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

PV = "23.1.3"

RPM_NAME = "libgbm-devel-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "288bfb50b8cfa4e52592116870c33bfe642c9f77f2b5873b68ef0797273d9105707f894ef813c8c5d12728c20e35bc1ca7b780fd18fe7a132988137f7320e957"

RPROVIDES:${PN} += "libgbm-devel \
pkgconfig-gbm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgbm1"

inherit rpm
