SUMMARY = "Development files for libftxf"
DESCRIPTION = "libftxf is a library for Transactional NTFS (TxF) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libftxf."
LICENSE = "LGPL-3.0-or-later"

PV = "20220116"

RPM_NAME = "libftxf-devel-20220116-3.3.aarch64.rpm"
RPM_HASH = "4f62162013d0314cb8c8d166d39192e68e1b4480727ba6c34613e20c88150b3c6f3dfcb1124bcc155de3c3822c32d63d16ea5e5d7c82206cbb2c30c579a2b1b2"

RPROVIDES:${PN} += "libftxf-devel \
pkgconfig-libftxf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libftxf1"

inherit rpm
