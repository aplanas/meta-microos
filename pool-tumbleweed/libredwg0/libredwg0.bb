SUMMARY = "A library to handle DWG files"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.5"

RPM_NAME = "libredwg0-0.12.5-3.4.aarch64.rpm"
RPM_HASH = "22bff2866aacf7c2ecc3e7352f2867da87e84a8ea77a5e852d5926b00256e900c238f9e32da2986d6072ed23ea437bb8ece77bcb1a5d3e88dec7f19b56b072d5"

RPROVIDES:${PN} += "libredwg.so.0 \
libredwg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
