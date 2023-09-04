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

RPM_NAME = "python310-libvhdi-20221124-4.1.aarch64.rpm"
RPM_HASH = "26cf9be50dad82f780d1491cd38f0b180a8711a0404e7d78f4ed337dbd43753a30a185c0f0fc09477d99dd9c0a1db23fc7e2bc2ff3a679b2c930ba06f9516515"

RPROVIDES:${PN} += "python310-libvhdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libvhdi.so.1 \
python-abi"

inherit rpm
