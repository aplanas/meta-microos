SUMMARY = "Header files and libraries for developing applications for libvmdk"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format. \
 \
See libvmdk for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libvmdk."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvmdk-devel-20221124-3.11.aarch64.rpm"
RPM_HASH = "b04bd1d3e3b5eea84b8b62b2363b3cacfdd0efe93a8037cce6efe4c19e2f4d25155e75c71f34c5d0d7a8e7783662a2607c4f0ca0f252df39566e70201d16c1d1"

RPROVIDES:${PN} += "libvmdk-devel \
pkgconfig-libvmdk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvmdk1"

inherit rpm
