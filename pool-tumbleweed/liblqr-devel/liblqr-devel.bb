SUMMARY = "Development files for the Liquid Rescale library"
DESCRIPTION = "The Liquid Rescale (lqr) library provides a C/C++ API for performing \
non-uniform resizing of images by the seam-carving technique. \
 \
This package contains the development files for liblqr."
LICENSE = "LGPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "liblqr-devel-0.4.2-7.4.aarch64.rpm"
RPM_HASH = "a4da5cd8c046f8fbee406c23f3c8fadd6baca8db184ae264c87522394cfd7b508d233f67f8449c73a736620c3633c874da4f83f9a76e5fa2ff85a3ab961547cd"

RPROVIDES:${PN} += "liblqr-devel \
pkgconfig-lqr-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblqr-1-0 \
pkgconfig-glib-2.0"

inherit rpm
