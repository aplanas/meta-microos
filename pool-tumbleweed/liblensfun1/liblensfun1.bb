SUMMARY = "Library files for lensfun/lensfun-devel"
DESCRIPTION = "Library files needed by the use the lensfun library/database."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "liblensfun1-0.3.3-1.7.aarch64.rpm"
RPM_HASH = "5dba5ab0dd5ae782aeecafedb4eaaf2dc04c172837557532b2c782cc416b590f4260ee1b7e79f30b8488cf052acb7ab80721a179f5a3416c5b1fe81a8c1c60bb"

RPROVIDES:${PN} += "lensfun \
liblensfun.so.1()(64bit) \
liblensfun1 \
liblensfun1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
lensfun-data \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
