SUMMARY = "Development files for libvhdi, a VHD image format library"
DESCRIPTION = "libvhdi is a library to access the Virtual Hard Disk (VHD) image format.  see libvhdi for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvhdi."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvhdi-devel-20221124-4.1.aarch64.rpm"
RPM_HASH = "2d1210a0c78b2e230aed3ee8abfcac50fa31e42f23c1b566d8cebb0bfab16eb3d06fbebf518cc3c35d444eea2512d5a7f7a20b3b5a86e584c667784133a00e68"

RPROVIDES:${PN} += "libvhdi-devel \
pkgconfig-libvhdi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvhdi1"

inherit rpm
