SUMMARY = "Haskell bindings to setlocale"
DESCRIPTION = "Haskell bindings to setlocale."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-1.0.0.10-4.3.aarch64.rpm"
RPM_HASH = "ab513a760f2666f2d36bce59deec613a18507d236602d3306d4a3988916e6e9a9535f6fa77b7c4cf3d1fa5b73530c699915591b7f93f0f260c2b4b0637158ac9"

RPROVIDES:${PN} += "ghc-setlocale \
libHSsetlocale-1.0.0.10-EX0ACS22UctCUxDRUitp1V-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
