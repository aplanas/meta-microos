SUMMARY = "Library to access the VMDK image format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format. \
 \
Read supported extent file formats: \
 \
* RAW (flat) \
* COWD version 1 (sparse) \
* VMDK version 1, 2 and 3 (sparse) \
 \
Supported VMDK format features: \
 \
* delta links \
* grain compression \
* data markers \
 \
VMDK format features not supported at the moment: \
 \
* images that use a physical device \
* changed block tracking (CBT) (supported by VMDK version 3 (sparse)) / change tracking files"
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvmdk1-20221124-3.11.aarch64.rpm"
RPM_HASH = "eaeba3cb4ae96b017055f97f1e34d8e02202abacb04018ffa26764144e41ac692eec44c5391b88ffce8d7b42eb47b90bb39e0d875c0b5769c971d511f471ed2d"

RPROVIDES:${PN} += "libvmdk.so.1 \
libvmdk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libcsplit.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfvalue.so.1 \
libuna.so.1 \
libz.so.1"

inherit rpm
