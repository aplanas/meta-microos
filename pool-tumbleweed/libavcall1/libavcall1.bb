SUMMARY = "FFI library for variadic argument functions"
DESCRIPTION = "A library for building foreign function call interfaces in embedded \
interpreters. \
This library allows calling C functions with variable argument \
prototypes."
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "libavcall1-2.4-2.7.aarch64.rpm"
RPM_HASH = "15df892ee02ad644ce6b561cd0ab05318313b5e0ccf2d076d5267f8aae161ebc86bea26861f8028528a7d8f7e8fd2f60c6decd1e626b15a707d83784e35980a1"

RPROVIDES:${PN} += "libavcall.so.1()(64bit) \
libavcall1 \
libavcall1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
