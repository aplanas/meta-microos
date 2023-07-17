SUMMARY = "Library for Windows XML Event Log data types"
DESCRIPTION = "libfwevt is a library for Windows XML Event Log (EVTX) data types. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20230410"

RPM_NAME = "libfwevt1-20230410-1.4.aarch64.rpm"
RPM_HASH = "d59b45b49ddfca93da8e7b92e3a9883726aa9d592323ef17c8fbe892a84ed4407163b891438dfd422077232825962604e4c50cf323a71930e38c56c557756181"

RPROVIDES:${PN} += "libfwevt.so.1 \
libfwevt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm
