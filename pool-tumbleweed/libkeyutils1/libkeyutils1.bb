SUMMARY = "Key utilities library"
DESCRIPTION = "This package provides a wrapper library for the key management facility \
system calls."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libkeyutils1-1.6.3-6.1.aarch64.rpm"
RPM_HASH = "7103b2625f7fbadb727be76fb4a9c646d4a3e7b4aad07cac7b62cfcce5af50676678f262b18c0e7a3fac7183ed7ed0034aeb7b9ef7467f000f351bfe84fb63b1"

RPROVIDES:${PN} += "keyutils-libs \
libkeyutils.so.1()(64bit) \
libkeyutils1 \
libkeyutils1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
