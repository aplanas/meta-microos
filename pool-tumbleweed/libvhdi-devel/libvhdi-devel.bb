SUMMARY = "Development files for libvhdi, a VHD image format library"
DESCRIPTION = "libvhdi is a library to access the Virtual Hard Disk (VHD) image format.  see libvhdi for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvhdi."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvhdi-devel-20221124-3.10.aarch64.rpm"
RPM_HASH = "d56d9ce4d857f4c223b4f31327a23c970417ded79c0ada454547e31459a635b84de01f79f7b52ca5f96d159739586d896b8efc367339ca0c029a1cf771d0996d"

RPROVIDES:${PN} += "libvhdi-devel \
pkgconfig-libvhdi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvhdi1"

inherit rpm
