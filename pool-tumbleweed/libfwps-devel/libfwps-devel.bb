SUMMARY = "Development files for libfwps"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwps."
LICENSE = "LGPL-3.0-or-later"

PV = "20230711"

RPM_NAME = "libfwps-devel-20230711-2.1.aarch64.rpm"
RPM_HASH = "88410aad36b862b2c7b363bbed340c13fa158b9f674e210a7bc7cc5bf49be9da9da170548dc688796693468064de3575c91adb38aa748c46ae07e96f5d039250"

RPROVIDES:${PN} += "libfwps-devel \
pkgconfig-libfwps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwps1"

inherit rpm
