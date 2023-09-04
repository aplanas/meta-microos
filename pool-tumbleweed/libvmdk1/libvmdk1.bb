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

RPM_NAME = "libvmdk1-20221124-4.1.aarch64.rpm"
RPM_HASH = "a145ba226ccc0c9fcc1e9195c4ac692b64578c893a828d26d832e69a4449fb98c470b54ca44cf5976dcdbc873d78298b5fda951400df3aff32ccfba94c3c1101"

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
