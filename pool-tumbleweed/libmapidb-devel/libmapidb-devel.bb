SUMMARY = "Development files for libmapidb, a library for accessing the Exchange MAPI database format"
DESCRIPTION = "A library for accessing the Exchange MAPI database format \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmapidb."
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libmapidb-devel-20210421-2.3.aarch64.rpm"
RPM_HASH = "2d817bb1bbe4f18aa08edda540504844113cf68584f0029f281d5963cb09438ff4524cdb6da2cbe0ae51a6b9549b78be33d8bef5db0ef499441af0d72febc7cc"

RPROVIDES:${PN} += "libmapidb-devel \
libmapidb-devel(aarch-64) \
pkgconfig(libmapidb)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmapidb1"

inherit rpm
