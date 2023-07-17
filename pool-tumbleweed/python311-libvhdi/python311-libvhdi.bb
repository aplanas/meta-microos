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

RPM_NAME = "python311-libvhdi-20221124-3.11.aarch64.rpm"
RPM_HASH = "ef399cbfd759665728edc4d8621b6b7e2b712cd526da49f35d3e93bc12f744d6bdd27a7b19c08653553ee828bfcd3c99d4cd6c9afa3955c87e6b51b53be2b408"

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
