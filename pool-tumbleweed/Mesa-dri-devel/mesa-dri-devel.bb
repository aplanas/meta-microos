SUMMARY = "Development files for the DRI API"
DESCRIPTION = "This package contains the development environment required for \
compiling programs and libraries using the DRI API."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-dri-devel-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "7e042a620d39d06df9cc48e868245fe0030306061d987b9a22b4869dfa36e2863b6aa5fc836c33a64a468688c18917d0bf8637f733caabd53dbcab397394e54d"

RPROVIDES:${PN} += "Mesa-dri-devel \
pkgconfig-dri"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa \
pkgconfig-libdrm"

inherit rpm
