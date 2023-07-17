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

RPM_NAME = "libvhdi1-20221124-3.11.aarch64.rpm"
RPM_HASH = "2d1225431f7a7d0bc5e91f35c37987b76f2ce6fb1949fd58cd4672cd24d2fbf83bd7390e9f716eec0f41ae5d4fc5523dcd381fe60081e6dcb4c298a92f23ca17"

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
