SUMMARY = "Development files for libfwps"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwps."
LICENSE = "LGPL-3.0-or-later"

PV = "20230202"

RPM_NAME = "libfwps-devel-20230202-1.7.aarch64.rpm"
RPM_HASH = "2b1826f641bbc1cb606e625598879fbc881a5112a25f88be99e624f8264a3910cb86addcee927a59e74523fd0c456faaefcb84b96cd55675e18b06bf24071614"

RPROVIDES:${PN} += "libfwps-devel \
pkgconfig-libfwps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwps1"

inherit rpm
