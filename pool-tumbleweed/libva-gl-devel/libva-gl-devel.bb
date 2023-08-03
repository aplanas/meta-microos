SUMMARY = "Development files for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
 \
This package provides the development environment for libva gl packages."
LICENSE = "MIT"

PV = "2.19.0"

RPM_NAME = "libva-gl-devel-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "fc981503abd9e553cf5013759a047a3c49469ae8f8a67ad813e8b64907e3068d1a65b12a0612dad6c4e57b5263f624923e5587eebcd9b8f9ce7dacf38e8e77f2"

RPROVIDES:${PN} += "libva-gl-devel \
pkgconfig-libva-glx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libva-glx2 \
pkgconfig-gl \
pkgconfig-libva"

inherit rpm
