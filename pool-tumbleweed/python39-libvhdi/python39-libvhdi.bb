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

RPM_NAME = "python39-libvhdi-20221124-3.7.aarch64.rpm"
RPM_HASH = "d9a3a169e99548c5925305933d8210346666746fec2fcbb3d042c1bcf19fe248d657f929b60aeab1e6e7c1647b48a317cc892c7d28511e475b2eb430c2d3ce07"

RPROVIDES:${PN} += "python39-libvhdi \
python39-libvhdi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libvhdi.so.1()(64bit) \
libvhdi.so.1(V_20221124)(64bit) \
python(abi)"

inherit rpm
