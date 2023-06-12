SUMMARY = "Development files for libfplist"
DESCRIPTION = "libfplist is a library for plist formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfplist."
LICENSE = "LGPL-3.0-or-later"

PV = "20220116"

RPM_NAME = "libfplist-devel-20220116-3.4.aarch64.rpm"
RPM_HASH = "6126981672b83b543fc04ce1cf8461c980a5e5a01cc42650331f18d3c1497903ac0359774e1dbe6e5c2d00bc4fdbf0fd108638fd0ed5e7a68042409f77c4c01e"

RPROVIDES:${PN} += "libfplist-devel \
libfplist-devel(aarch-64) \
pkgconfig(libfplist)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfplist1"

inherit rpm
