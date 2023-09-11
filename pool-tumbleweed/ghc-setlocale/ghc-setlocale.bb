SUMMARY = "Haskell bindings to setlocale"
DESCRIPTION = "Haskell bindings to setlocale."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-1.0.0.10-5.1.aarch64.rpm"
RPM_HASH = "acd2e67e3a86188733cff0bda1965e50b52ea3fa35620fcd7d95f65b70568023aa42ae25bddcf55bf89b96bc4d543590ffe413c2824745d88686a3fb4d25a9d8"

RPROVIDES:${PN} += "ghc-setlocale \
libHSsetlocale-1.0.0.10-EX0ACS22UctCUxDRUitp1V-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
