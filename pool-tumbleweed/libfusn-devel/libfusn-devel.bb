SUMMARY = "Development files for libfusn"
DESCRIPTION = "libfusn is a library for Update Sequence Number (USN) Journal data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfusn."
LICENSE = "LGPL-3.0-or-later"

PV = "20220119"

RPM_NAME = "libfusn-devel-20220119-4.4.aarch64.rpm"
RPM_HASH = "68f6290faa600d42e0d74987b2d9baf7bc70f3fbef83710688f081ebc98f5f6588e18656bde047385141341d9e9c303eded0cba730b5642ffc512fdf2453dfbc"

RPROVIDES:${PN} += "libfusn-devel \
pkgconfig-libfusn"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfusn1"

inherit rpm
