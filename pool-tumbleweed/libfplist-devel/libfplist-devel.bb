SUMMARY = "Development files for libfplist"
DESCRIPTION = "libfplist is a library for plist formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfplist."
LICENSE = "LGPL-3.0-or-later"

PV = "20220116"

RPM_NAME = "libfplist-devel-20220116-3.6.aarch64.rpm"
RPM_HASH = "61de51a750cfa9242713e9cdcf77fd073555e48a19fb8de1716719254f1ec880b856f0ab06d87886fd530275011c5234d43c46156205f3f2ec0969e04b5e4390"

RPROVIDES:${PN} += "libfplist-devel \
pkgconfig-libfplist"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfplist1"

inherit rpm
