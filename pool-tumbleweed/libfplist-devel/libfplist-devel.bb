SUMMARY = "Development files for libfplist"
DESCRIPTION = "libfplist is a library for plist formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfplist."
LICENSE = "LGPL-3.0-or-later"

PV = "20220116"

RPM_NAME = "libfplist-devel-20220116-3.7.aarch64.rpm"
RPM_HASH = "e7a04460d5940c695d3a0d9f9644bb615bfbb50f57a50f95d23949951c0d05184112157d24ca823cd6fbba697f1fe3fb4a1aa8af8be4b7766ea2e131eeb77dd6"

RPROVIDES:${PN} += "libfplist-devel \
pkgconfig-libfplist"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfplist1"

inherit rpm
