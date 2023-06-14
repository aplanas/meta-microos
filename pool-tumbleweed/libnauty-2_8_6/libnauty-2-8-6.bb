SUMMARY = "Graph automorphism group computation with Nauty"
DESCRIPTION = "nauty and Traces are programs for computing automorphism groups of \
graphs and digraphs. They can also produce a canonical label."
LICENSE = "Apache-2.0"

PV = "2.8.6"

RPM_NAME = "libnauty-2_8_6-2.8.6-1.3.aarch64.rpm"
RPM_HASH = "222eb399f544bbdbee4befba7f80c606a29a0702c536782f7219474d0e0bc21fbc134a37093ecf6b73a05ac9c365c058c964a7e76a2b9ea047de2b036922b3a5"

RPROVIDES:${PN} += "libnauty-2-8-6 \
libnauty-2.8.6.so \
libnautyA1-2.8.6.so \
libnautyL0-2.8.6.so \
libnautyL1-2.8.6.so \
libnautyS0-2.8.6.so \
libnautyS1-2.8.6.so \
libnautyW0-2.8.6.so \
libnautyW1-2.8.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
