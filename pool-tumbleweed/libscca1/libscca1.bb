SUMMARY = "Library to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca is a library to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "libscca1-20230716-1.1.aarch64.rpm"
RPM_HASH = "2f99ceb401906f77c70242b7d529813b3d653692064adcc967bc8d5d87f8c31bd0876da54c79dfbe36354d0be4ef4f246b5259f9456721d0e0e51299e65e5ffc"

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
