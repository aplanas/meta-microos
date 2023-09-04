SUMMARY = "Development files for libvsmbr"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume systems. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvsmbr."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "libvsmbr-devel-20210509-5.1.aarch64.rpm"
RPM_HASH = "1d9ecf3edbb299f787ebe98726c1fa5bcb51ed3cb28b068a8304ddc4494ced75e7e627edd6a48a2fe41a4eb48b0029fd323f1abe70c21f560f483634ccda516a"

RPROVIDES:${PN} += "libvsmbr-devel \
pkgconfig-libvsmbr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvsmbr1"

inherit rpm
