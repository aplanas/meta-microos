SUMMARY = "Header files and libraries for developing applications for libvmdk"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format. \
 \
See libvmdk for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libvmdk."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvmdk-devel-20221124-4.1.aarch64.rpm"
RPM_HASH = "eb4087c39edfbde619976df458e980ca2fa8eef0322e52ef17e63eb4e7f02cadeaf559c1afc40bbebaffcdc0f29e0e06bda8d6976a77aa251b5237091e4ab00f"

RPROVIDES:${PN} += "libvmdk-devel \
pkgconfig-libvmdk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvmdk1"

inherit rpm
