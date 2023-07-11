SUMMARY = "Haskell pretty library"
DESCRIPTION = "This package provides the Haskell pretty library."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-1.1.3.6-3.2.aarch64.rpm"
RPM_HASH = "d32b33974226b28ad00cf3e3bcdbe1aab81696207734ba108a1f1af298773dcf0c205a24eca70da16ddee9ee795c3ab510e9313f14f58870b356c935a6967cb3"

RPROVIDES:${PN} += "ghc-pretty \
libHSpretty-1.1.3.6-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
