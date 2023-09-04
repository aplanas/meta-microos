SUMMARY = "Difference lists"
DESCRIPTION = "List-like types supporting O(1) append and snoc operations."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-1.0-3.3.aarch64.rpm"
RPM_HASH = "91efaf821170b2ade6c9949fc6bd38fe03e77d66d67a7336c4a18cb4303e7bd33d8947b510c58273c0f226a546a8409e278c3bb067215b717dbc524c69bcfcd8"

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
