SUMMARY = "Library to access the VHD image format"
DESCRIPTION = "Library to access the Virtual Hard Disk (VHD) image format. \
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
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvhdi1-20221124-4.1.aarch64.rpm"
RPM_HASH = "df1367342baf369616cdee2a4f699ce4a1715d0a910340f7b0a10610ece16059d8afd1b4e4041b956d4b6e5d25c00b917df03df7c18c3d916e831993dad780e4"

RPROVIDES:${PN} += "libvhdi.so.1 \
libvhdi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfguid.so.1 \
libuna.so.1"

inherit rpm
