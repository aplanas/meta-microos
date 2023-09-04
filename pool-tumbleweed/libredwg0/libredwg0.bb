SUMMARY = "A library to handle DWG files"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.5.5907"

RPM_NAME = "libredwg0-0.12.5.5907-2.1.aarch64.rpm"
RPM_HASH = "d885c057b0f97082d6b96886f5dba3557661ce4b89ce9d1a77c3bb138a24364257780051f76a70c30b99d55f3990ed713e416590339154f738fde2e5622bd160"

RPROVIDES:${PN} += "libredwg.so.0 \
libredwg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
