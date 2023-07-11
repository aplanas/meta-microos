SUMMARY = "An EPUB generator library"
DESCRIPTION = "libepubgen is a library for generating EPUB documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "MPL-2.0"

PV = "0.1.1"

RPM_NAME = "libepubgen-0_1-1-0.1.1-1.22.aarch64.rpm"
RPM_HASH = "892ac80a741e7498403a1f9dab8aae3fee5ab4cf527109fc3118366528bda0fc4f0bd54e006005efa7f4b1efda6d74540ac0159cbc26e33a5c393d6f445508a5"

RPROVIDES:${PN} += "libepubgen-0-1-1 \
libepubgen-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
