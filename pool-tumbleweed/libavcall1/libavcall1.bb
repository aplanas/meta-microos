SUMMARY = "FFI library for variadic argument functions"
DESCRIPTION = "A library for building foreign function call interfaces in embedded \
interpreters. \
This library allows calling C functions with variable argument \
prototypes."
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "libavcall1-2.4-2.8.aarch64.rpm"
RPM_HASH = "a21e359f5925875a26e88a54239089c70622d7911855945fd8661e58dddcad0659c580282708032b4d1b5b6c4417277de17497039e05d1681a591460d352653b"

RPROVIDES:${PN} += "libavcall.so.1 \
libavcall1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
