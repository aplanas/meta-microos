SUMMARY = "Library for accessing the GUID partition table format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "libvsgpt1-20221029-3.9.aarch64.rpm"
RPM_HASH = "a05c709a9258febf201b907822c8044af85713e2736b56ef2444cf6d21418429b02514509c605fe6512fcece425081a43271a5bb661c3bfa0f7a0ae65df76014"

RPROVIDES:${PN} += "libvsgpt.so.1 \
libvsgpt1"

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
libfdata.so.1"

inherit rpm
