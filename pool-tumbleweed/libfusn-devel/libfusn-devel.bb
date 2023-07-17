SUMMARY = "Development files for libfusn"
DESCRIPTION = "libfusn is a library for Update Sequence Number (USN) Journal data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfusn."
LICENSE = "LGPL-3.0-or-later"

PV = "20220119"

RPM_NAME = "libfusn-devel-20220119-4.5.aarch64.rpm"
RPM_HASH = "60ddbe6e7cef851f39384a9caf808371a30879c637c2433f754dc623ed44f31c0add722534b827f052c3dc5d73748e68928d639487e23ce8813c37f3915e2df9"

RPROVIDES:${PN} += "libfusn-devel \
pkgconfig-libfusn"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfusn1"

inherit rpm
