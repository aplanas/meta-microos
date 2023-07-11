SUMMARY = "Double-Array Trie Library"
DESCRIPTION = "This is an implementation of double-array structure for representing \
trie, as proposed by Junichi Aoe."
LICENSE = "LGPL-2.1-only"

PV = "0.2.13"

RPM_NAME = "libdatrie1-0.2.13-1.11.aarch64.rpm"
RPM_HASH = "4c836cbbb0e5b9c0e02192e6cdf88d025a9697772296b3b5a1476d184e4f04393786ac8fde2d6dfe66e4b94057ab45a058a7c170b5637c019c5e80af4898cb56"

RPROVIDES:${PN} += "libdatrie.so.1 \
libdatrie1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
