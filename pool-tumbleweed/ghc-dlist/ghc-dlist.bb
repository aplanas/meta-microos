SUMMARY = "Difference lists"
DESCRIPTION = "List-like types supporting O(1) append and snoc operations."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-1.0-4.1.aarch64.rpm"
RPM_HASH = "dcd54b6f5dd163d99eb8447d95dfdb27cf298b7e2a37df3a4b2336e58d91df5b7d49192ee365ca2befe23d5acbda639e15dc741c6b032fecaaf1837f87c7db8a"

RPROVIDES:${PN} += "ghc-dlist \
libHSdlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
