SUMMARY = "Library to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca is a library to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "libscca1-20221027-3.10.aarch64.rpm"
RPM_HASH = "8bd02504c486b24ab3e9a38a54a1e8e9748d95249815b36105d2bd362780813d315ac7b3ea63bef1367cf2aff46d0de90fb2b3eeb7b9fd1af416f1abd6afaffe"

RPROVIDES:${PN} += "libscca.so.1 \
libscca1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfvalue.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
