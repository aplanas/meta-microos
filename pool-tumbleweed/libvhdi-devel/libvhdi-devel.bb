SUMMARY = "Development files for libvhdi, a VHD image format library"
DESCRIPTION = "libvhdi is a library to access the Virtual Hard Disk (VHD) image format.  see libvhdi for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvhdi."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvhdi-devel-20221124-3.11.aarch64.rpm"
RPM_HASH = "e7d02bde9901f80d29c006a5181fa892738d0b8d96855a3c7c37cdb26179a263436e48f96ecebf5038e8b156f0da7b8da49a66f7dc67620b5a6a51bdc18bd5b2"

RPROVIDES:${PN} += "libvhdi-devel \
pkgconfig-libvhdi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvhdi1"

inherit rpm
