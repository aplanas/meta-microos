SUMMARY = "Martin Erwig's Functional Graph Library"
DESCRIPTION = "An inductive representation of manipulating graph data structures. \
 \
Original website can be found at \
<http://web.engr.oregonstate.edu/~erwig/fgl/haskell>."
LICENSE = "BSD-3-Clause"

PV = "5.8.0.0"

RPM_NAME = "ghc-fgl-5.8.0.0-3.4.aarch64.rpm"
RPM_HASH = "22e2b50aa91cc4cb4e851cfd2f36a67dce1d6b15e1fdbfc5cf485e22d73718d4c43730ea447ac27003e2c4a14bbb9c8a4b5ecca5ea0fb041c8e85c3ec89dfc45"

RPROVIDES:${PN} += "ghc-fgl \
libHSfgl-5.8.0.0-JXOHdIncLQ9K05kSZoGOKU-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
