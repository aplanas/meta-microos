SUMMARY = "Secure Reliable Transport (SRT) library"
DESCRIPTION = "This package contains a shared system library for Secure Reliable \
Transport (SRT)."
LICENSE = "MPL-2.0"

PV = "1.5.1"

RPM_NAME = "libsrt1_5-1.5.1-1.4.aarch64.rpm"
RPM_HASH = "7a3507cc986305f83e28c16e4da5b74c668a02b104aafe85972ec62651f25efb793b3990f3c2710b35a3b36fada79a18fafdd3273564921936e33dfe2a99b67e"

RPROVIDES:${PN} += "libsrt.so.1.5 \
libsrt1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
