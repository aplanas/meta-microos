SUMMARY = "Double-Array Trie Library"
DESCRIPTION = "This is an implementation of double-array structure for representing \
trie, as proposed by Junichi Aoe."
LICENSE = "LGPL-2.1-only"

PV = "0.2.13"

RPM_NAME = "libdatrie1-0.2.13-1.10.aarch64.rpm"
RPM_HASH = "266a2f73d14382da1a2c3537a14e67a1e76d33c1c20c84f49cb531f55190ab0e40d5d1edfe5f2ce92a2ce8a1d562803e20a272f155f370791117e0d152729ed5"

RPROVIDES:${PN} += "libdatrie.so.1 \
libdatrie1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
