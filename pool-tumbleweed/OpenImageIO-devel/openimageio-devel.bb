SUMMARY = "Development Files for OpenImageIO"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using OpenImageIO."
LICENSE = "BSD-3-Clause"

PV = "2.4.13.0"

RPM_NAME = "OpenImageIO-devel-2.4.13.0-1.1.aarch64.rpm"
RPM_HASH = "80e7aeef4f9fda1f53469f8b9ca281891d76bdeb4d851eeeb76a17fee99367ca11214c2f00237e2d5ae739bdddd2fef5bb868ded1bfee887df5220989c3d3b6d"

RPROVIDES:${PN} += "OpenImageIO-devel \
cmake-OpenImageIO \
pkgconfig-OpenImageIO"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fmt-devel \
libOpenImageIO-Util2-4 \
libOpenImageIO2-4"

inherit rpm
