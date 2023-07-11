SUMMARY = "Lightweight package providing commonly useful parser combinators"
DESCRIPTION = "Lightweight package providing commonly useful parser combinators."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-parser-combinators-1.3.0-2.6.aarch64.rpm"
RPM_HASH = "2a89c5160d0cb22008c6830c6134288e3a9ee75f3a95306c226a45aa9d290aabb0582c281ea8a39e8a54b3b07789a5ef4453dbd22533db435050e33897a904f5"

RPROVIDES:${PN} += "ghc-parser-combinators \
libHSparser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
