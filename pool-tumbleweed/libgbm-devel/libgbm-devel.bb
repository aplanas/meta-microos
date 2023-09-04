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

PV = "23.1.5"

RPM_NAME = "libgbm-devel-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "3228db8cc60fdd6ed34974892e2947d50cf0f1a3039dd44888216cc3869ad63cf580e28ebbf5ba1ba5ad5542b9a6c4d555a14b56347b20b143a6af7e2300357a"

RPROVIDES:${PN} += "libgbm-devel \
pkgconfig-gbm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgbm1"

inherit rpm
