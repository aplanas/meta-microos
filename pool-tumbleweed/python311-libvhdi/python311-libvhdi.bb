SUMMARY = "Library and tools to access the VHD image format"
DESCRIPTION = "Library and tools to access the Virtual Hard Disk (VHD) image format. \
 \
Read-supported formats: \
 \
* VHD version 1 \
 \
Supported image types: \
 \
* Fixed-size hard disk image \
* Dynamic-size (or sparse) hard disk image \
* Differential (or differencing) hard disk image \
* Note that an undo disk image (.vud) is also a differential image"
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python311-libvhdi-20221124-4.1.aarch64.rpm"
RPM_HASH = "c9cf2592b88f609bc23a72a733f9c37e405b80c701d5b7d6e65710b796441b0115c16758fce9a78c0806c4a6b47e74555c094a1266a934e8c5d7bb91e7618429"

RPROVIDES:${PN} += "python3-libvhdi \
python311-libvhdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvhdi.so.1 \
python-abi"

inherit rpm
