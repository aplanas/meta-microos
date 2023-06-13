SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile-srfi-srfi-60-v-2-2-1.8.8-23.11.aarch64.rpm"
RPM_HASH = "960a012bfdb2a6acd5b7999697dd1c06abe623b96fe071ce160bccc890b5d27aacb880a1f467968c43f0f36988f0db08ff716051ce07a968a2e4e2340d9fcaf3"

RPROVIDES:${PN} += "libguile-srfi-srfi-60-v-2-2 \
libguile-srfi-srfi-60-v-2-2(aarch-64) \
libguile-srfi-srfi-60-v-2.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libguile.so.17()(64bit)"

inherit rpm
