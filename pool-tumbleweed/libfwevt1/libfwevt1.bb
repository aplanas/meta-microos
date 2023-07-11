SUMMARY = "Library for Windows XML Event Log data types"
DESCRIPTION = "libfwevt is a library for Windows XML Event Log (EVTX) data types. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20230410"

RPM_NAME = "libfwevt1-20230410-1.3.aarch64.rpm"
RPM_HASH = "2592818220c90feb7aef63a1b2c54019eb83413d5710465600e1febdb1ac3c8e185fc68f42f12b22a18bb235cbdb2ed949c68e35605259612cf52d768dc53105"

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
