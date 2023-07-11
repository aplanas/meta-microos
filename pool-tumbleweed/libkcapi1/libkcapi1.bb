SUMMARY = "Linux Kernel Crypto API User Space Interface Library"
DESCRIPTION = "libkcapi allows user-space to access the Linux kernel crypto API."
LICENSE = "GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "libkcapi1-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "5710ae86ec02641048f7771dda250c9589ad52793c61ecc421705e475fce0e1f52ace1f44e04fc9132473c3586562034effa6b9b0b17063cd93434c45d9b61e5"

RPROVIDES:${PN} += "libkcapi.so.1 \
libkcapi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
