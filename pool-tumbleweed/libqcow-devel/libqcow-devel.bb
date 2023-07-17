SUMMARY = "Development files for libqcow"
DESCRIPTION = "libqcow is a library to access the QEMU Copy-On-Write (QCOW) image format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libqcow."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "libqcow-devel-20221124-3.14.aarch64.rpm"
RPM_HASH = "91f71b147b0cdbd2f0a5fc4b522809dc73a540590866731718290bc05f3d6c2c2c3439a23f22b457baf053fa186206e17f6709d3d2f950face5ab63c85ca0ddf"

RPROVIDES:${PN} += "libqcow-devel \
pkgconfig-libqcow"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libqcow1"

inherit rpm
