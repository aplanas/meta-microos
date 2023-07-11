SUMMARY = "C object-oriented SIP Stack"
DESCRIPTION = "Belle-sip is a SIP (RFC3261) implementation written in C, with an \
object-oriented API."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "libbellesip1-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "c242706ac60b5e6c6485f06d03c1a8d7caa178a67d6a3d4d43eab380694cbc61932fd5d1f5aea466181b41d886825fa77d1bc15ad339581ac57f3610d49dfbef"

RPROVIDES:${PN} += "libbellesip.so.1 \
libbellesip1"

RDEPENDS:${PN} += "/sbin/ldconfig \
belle-sip-data \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libbelr.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
