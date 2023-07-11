SUMMARY = "Development files for libqcow"
DESCRIPTION = "libqcow is a library to access the QEMU Copy-On-Write (QCOW) image format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libqcow."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "libqcow-devel-20221124-3.13.aarch64.rpm"
RPM_HASH = "8d50d0bad28706b051372a2ddefb0e6cecbe432cbcf66c83397de8bb0a4466e52447dcbc9899e53464cc59fa4fc696cc1ee1aca0260c2c225b47c64bb21cfce1"

RPROVIDES:${PN} += "libqcow-devel \
pkgconfig-libqcow"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libqcow1"

inherit rpm
