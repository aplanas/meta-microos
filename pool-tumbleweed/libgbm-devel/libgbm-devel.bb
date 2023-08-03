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

PV = "23.1.4"

RPM_NAME = "libgbm-devel-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "2b3aae1ae9a906a7a9576f1893d2b50e98d3c700cfbfa422ce78c316f44928fe2d3fc73fc734df498e0ae2c18048c08195ca333ba6c44cda05da6f1c584a3eaa"

RPROVIDES:${PN} += "libgbm-devel \
pkgconfig-gbm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgbm1"

inherit rpm
