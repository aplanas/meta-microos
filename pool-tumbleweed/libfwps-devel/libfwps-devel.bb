SUMMARY = "Development files for libfwps"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwps."
LICENSE = "LGPL-3.0-or-later"

PV = "20230711"

RPM_NAME = "libfwps-devel-20230711-1.1.aarch64.rpm"
RPM_HASH = "a023ddc183f89a6bb764742a67b2f16027c908430876607d71ea39d286048e26cbf0286f43cc6ae7fc044ac5b91e38c4aa055c15fc4ac1a534d12439e1a41971"

RPROVIDES:${PN} += "libfwps-devel \
pkgconfig-libfwps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwps1"

inherit rpm
