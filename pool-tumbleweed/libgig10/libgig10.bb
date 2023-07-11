SUMMARY = "Library for loading Gigasampler and DLS Level 1/2 files"
DESCRIPTION = "C++ library for loading Gigasampler and DLS Level 1/2 files."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.0"

RPM_NAME = "libgig10-4.3.0-1.10.aarch64.rpm"
RPM_HASH = "592684cdd3ff61606b6a39da0d7bd86e7e51ea8ecc150256a5e7164ddef8382505df8077ae3a840b44a65b04f86b50968252d5bb5734de0b7962b0534121a101"

RPROVIDES:${PN} += "config-libgig10 \
libgig.so.10 \
libgig10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
