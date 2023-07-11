SUMMARY = "O(ND) diff algorithm in haskell"
DESCRIPTION = "Implementation of the standard diff algorithm, and utilities for pretty \
printing."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-Diff-0.4.1-2.6.aarch64.rpm"
RPM_HASH = "c9e6027870d082a5b416068b8360d1387378c522689c5d8fd14184dd3efc9abe826033760f9162a6b76d94c689b03cb58631e6443b982c5f555171c1ac648b5f"

RPROVIDES:${PN} += "ghc-Diff \
libHSDiff-0.4.1-CiDqeLEcsRQOQjfgZOPVP-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
