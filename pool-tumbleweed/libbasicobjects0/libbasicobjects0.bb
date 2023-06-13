SUMMARY = "Library containing basic objects like dynamic string"
DESCRIPTION = "A small library that provides a buffer object."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.1"

RPM_NAME = "libbasicobjects0-0.1.1-27.18.aarch64.rpm"
RPM_HASH = "ddb8678319cda361d5bb4847337308312cefa665e38ceab84e79ab237fd5f86f09fca52562ba1ad77551659daad13c005e5ebbe18fabe0465305bb2e5a39cb4a"

RPROVIDES:${PN} += "libbasicobjects.so.0()(64bit) \
libbasicobjects0 \
libbasicobjects0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
