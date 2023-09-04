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

RPM_NAME = "python39-libvhdi-20221124-4.1.aarch64.rpm"
RPM_HASH = "83d9bb804a0a724e42c4a95fd2c60e95adc45c666645c7fdeb2efe3dd7c4892f15bf8f583a0b82fb3eae5f74c5f261cf4f73a9f5576ef5ae0083bfbcfb5b24d8"

RPROVIDES:${PN} += "python39-libvhdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvhdi.so.1 \
python-abi"

inherit rpm
