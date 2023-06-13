SUMMARY = "System libraries for libicns"
DESCRIPTION = "System libraries file for libicns."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1+git20201014"

RPM_NAME = "libicns1-0.8.1+git20201014-1.10.aarch64.rpm"
RPM_HASH = "0cd9b3c911b06170ef9abb4c60127e37c746a75d1e3c385de7ab3b7014602874ff3cc2f20634c88c3e7d9ed62c666808f14fda969dc430d483d33d57a05df2c3"

RPROVIDES:${PN} += "libicns.so.1()(64bit) \
libicns1 \
libicns1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libopenjp2.so.7()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
