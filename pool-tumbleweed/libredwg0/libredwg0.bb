SUMMARY = "A library to handle DWG files"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.5"

RPM_NAME = "libredwg0-0.12.5-3.5.aarch64.rpm"
RPM_HASH = "fa008178cf5804854b56a9de08f29b29ac820998a118178081fff718ec3c4b165d5c35fea8e28e92b4dc75296f8076c74240968ae03165ede68d9f67c0e74568"

RPROVIDES:${PN} += "libredwg.so.0 \
libredwg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
