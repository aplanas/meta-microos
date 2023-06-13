SUMMARY = "Martin Erwig's Functional Graph Library"
DESCRIPTION = "An inductive representation of manipulating graph data structures. \
 \
Original website can be found at \
<http://web.engr.oregonstate.edu/~erwig/fgl/haskell>."
LICENSE = "BSD-3-Clause"

PV = "5.8.0.0"

RPM_NAME = "ghc-fgl-5.8.0.0-2.3.aarch64.rpm"
RPM_HASH = "047dc874a29062bf4df67b7df1e8a73e68745d73bb84a3e74b94cbd67034df033d8685d06a4760caac24efc4ed87ad14770a61d5f7dab96de1fba07f26d89ea0"

RPROVIDES:${PN} += "ghc-fgl \
ghc-fgl(aarch-64) \
libHSfgl-5.8.0.0-1euDADByC3LGFbnFGelVpn-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
