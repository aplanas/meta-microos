SUMMARY = "Martin Erwig's Functional Graph Library"
DESCRIPTION = "An inductive representation of manipulating graph data structures. \
 \
Original website can be found at \
<http://web.engr.oregonstate.edu/~erwig/fgl/haskell>."
LICENSE = "BSD-3-Clause"

PV = "5.8.0.0"

RPM_NAME = "ghc-fgl-5.8.0.0-3.2.aarch64.rpm"
RPM_HASH = "a9802f53e4377265f3e310469815c88e51765d4a3e99b60fb96279576fdff5441da57693c1c1a0ab9b50887aa6a58142ef8859dec14e5a39317301a63ffd1a55"

RPROVIDES:${PN} += "ghc-fgl \
libHSfgl-5.8.0.0-1euDADByC3LGFbnFGelVpn-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
