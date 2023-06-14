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

RPM_NAME = "libvmdk1-20221124-3.7.aarch64.rpm"
RPM_HASH = "dddbbdbc805e317b99991595b3348e325c2beca97ce77fd861594593a76287208e036104c9b97fc93aa1da1d7f9e3de199450e66ee0bd7e80df6499d1986b56e"

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
