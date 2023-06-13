SUMMARY = "XPS document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read XPS documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-xpsdocument-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "c90d69ad4b6b1c28090a2a5d48a934d2399b9671970ad1ca2188dbc587e4fd01e2b00fe753acc6d97707cfba3a9ae9dd324a16107d83b4a02bc70b72dec5f512"

RPROVIDES:${PN} += "libxpsdocument.so()(64bit) \
xreader-plugin-xpsdocument \
xreader-plugin-xpsdocument(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgxps.so.2()(64bit) \
libxreaderdocument.so.3()(64bit) \
xreader"

inherit rpm
