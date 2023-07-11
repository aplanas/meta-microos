SUMMARY = "Development files for the Apache Portable Runtime (APR) library"
DESCRIPTION = "APR is Apache's Portable Runtime Library, designed to be a support \
library that provides a predictable and consistent interface to \
underlying platform-specific implementations. \
 \
This subpackage contains header files for developing applications \
that want to make use of APR."
LICENSE = "Apache-2.0"

PV = "1.7.4"

RPM_NAME = "apr-devel-1.7.4-1.2.aarch64.rpm"
RPM_HASH = "b128a483087354bb60be236964bc03923d0fd0849589faee40f91e38ca0c7531849408c98dca5921564cbb281080bb287836766ff5e476c1a7676d3494dbe4c0"

RPROVIDES:${PN} += "apr-devel \
libapr1-devel \
pkgconfig-apr-1"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/sh \
libapr1-0"

inherit rpm
