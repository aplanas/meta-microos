SUMMARY = "Header files and libraries for developing applications for libvmdk"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format. \
 \
See libvmdk for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libvmdk."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvmdk-devel-20221124-3.7.aarch64.rpm"
RPM_HASH = "5b1ddf5428feb39e35f8687bcc4349d241c192cbab12bddb79ff77a82370ae0675a8cdbe8e46705f683968b12f8a947202e774d74a9829508469f54110de993b"

RPROVIDES:${PN} += "libvmdk-devel \
libvmdk-devel(aarch-64) \
pkgconfig(libvmdk)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvmdk1"

inherit rpm
