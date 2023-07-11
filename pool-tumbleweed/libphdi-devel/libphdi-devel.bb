SUMMARY = "Development files for libphdi"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libphdi."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi-devel-20221025-3.11.aarch64.rpm"
RPM_HASH = "e68c94ac3c06ea5a74fdadbc8ebdcb39c408c3051a0c173178caae9bb46670d0982c654bda7975e80d9649991336b70d0a8430b4487f18e8a85f817c540ad12d"

RPROVIDES:${PN} += "libphdi-devel \
pkgconfig-libphdi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libphdi1"

inherit rpm
