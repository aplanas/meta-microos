SUMMARY = "Library for Windows XML Event Log data types"
DESCRIPTION = "libfwevt is a library for Windows XML Event Log (EVTX) data types. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20230410"

RPM_NAME = "libfwevt1-20230410-1.1.aarch64.rpm"
RPM_HASH = "87d81768bc2072b4798a66661700f56d2cea1a75253061a4c46801bf222ecd191cbdc5d20e210e384bfabbcb09c18a5a67df2c022cb991935b88fb23f8a700c0"

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
