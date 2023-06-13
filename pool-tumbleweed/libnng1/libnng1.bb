SUMMARY = "Shared library for nng"
DESCRIPTION = "nng (nanomsg next-generation) is a C socket library providing \
several common communication patterns."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "libnng1-1.5.2-1.8.aarch64.rpm"
RPM_HASH = "7ba2dbd9b4d0ac57d5fb9f2ed9adcb04f3dad86eefdd3faab55eb1cfe16b97c01fbc96761aa895105bec079e48d0d6ee8cdcb0b4c08d55779f90c6d4acf26a93"

RPROVIDES:${PN} += "libnng.so.1()(64bit) \
libnng1 \
libnng1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit)"

inherit rpm
