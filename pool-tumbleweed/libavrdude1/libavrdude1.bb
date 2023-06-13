SUMMARY = "Shared library of avrdude"
DESCRIPTION = "This package contains the shared libavrdude library."
LICENSE = "GPL-2.0+"

PV = "6.3"

RPM_NAME = "libavrdude1-6.3-5.7.aarch64.rpm"
RPM_HASH = "5cbee61a6123f915721f11be4eaa493d66f956c7f83bd2a147669c6d81912136458c0538871f0a225b50d91115e0ccf21747a0aae852a3cbefc05d4a7b6f8696"

RPROVIDES:${PN} += "libavrdude.so.1()(64bit) \
libavrdude1 \
libavrdude1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
