SUMMARY = "Development files for libvsmbr"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume systems. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvsmbr."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "libvsmbr-devel-20210509-4.9.aarch64.rpm"
RPM_HASH = "09b953e6bbf81770c5d8c8b531a57b6bdf625a20d1c7844733ba165b2f3328439cb1f837abad19bcb68a3f4454a6f5686ebe497a805a6137e776fe9b793c77d8"

RPROVIDES:${PN} += "libvsmbr-devel \
pkgconfig-libvsmbr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvsmbr1"

inherit rpm
