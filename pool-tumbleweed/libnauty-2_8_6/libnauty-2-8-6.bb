SUMMARY = "Graph automorphism group computation with Nauty"
DESCRIPTION = "nauty and Traces are programs for computing automorphism groups of \
graphs and digraphs. They can also produce a canonical label."
LICENSE = "Apache-2.0"

PV = "2.8.6"

RPM_NAME = "libnauty-2_8_6-2.8.6-1.4.aarch64.rpm"
RPM_HASH = "fe591aea1784a606bdb6bf067649432b74bc90018a14af742001adff03c2abc14b58d0e84222c09abd108670c05428a29fc0602c23ad11c115ff208604ead514"

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
