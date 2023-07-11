SUMMARY = "Header files and libraries for developing applications for libvmdk"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format. \
 \
See libvmdk for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libvmdk."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvmdk-devel-20221124-3.10.aarch64.rpm"
RPM_HASH = "878a6692ade02c9257d99a749cd0f8b66e5ec8e6378397c7e2381365a2e98aabdbde09d74ecec5154ee7dbd6aaf7f9f8e768542cfa1bd549dbb391c7f17f830f"

RPROVIDES:${PN} += "libvmdk-devel \
pkgconfig-libvmdk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvmdk1"

inherit rpm
