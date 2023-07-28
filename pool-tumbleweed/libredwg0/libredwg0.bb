SUMMARY = "A library to handle DWG files"
DESCRIPTION = "GNU LibreDWG is a C library to handle DWG files. It can replace the \
OpenDWG libraries. DWG is the native file format of AutoCAD."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.5.5907"

RPM_NAME = "libredwg0-0.12.5.5907-1.1.aarch64.rpm"
RPM_HASH = "ee2d17b5db6e3834069ab0a78c15c71dd80c88bcc265a936bed95793117be3b53ede367f28092b70a0f1f8a2c5fc4395a0d8e5db7b4ae37521e091a40addad6e"

RPROVIDES:${PN} += "libredwg.so.0 \
libredwg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
