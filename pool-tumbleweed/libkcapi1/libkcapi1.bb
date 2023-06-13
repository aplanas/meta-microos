SUMMARY = "Linux Kernel Crypto API User Space Interface Library"
DESCRIPTION = "libkcapi allows user-space to access the Linux kernel crypto API."
LICENSE = "GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "libkcapi1-1.4.0-2.3.aarch64.rpm"
RPM_HASH = "4feb34fa9c8ecaa6e011bac7b754677b40dc646a03bf96c6d0227fd7c99d0e5aa132f7f5b20ad267383f6f3ca8640993b43bd2e509ef978c24d47a46dedbd9bf"

RPROVIDES:${PN} += "libkcapi.so.1()(64bit) \
libkcapi1 \
libkcapi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
