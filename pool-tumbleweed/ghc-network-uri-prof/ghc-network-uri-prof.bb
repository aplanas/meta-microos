SUMMARY = "Haskell network-uri profiling library"
DESCRIPTION = "This package provides the Haskell network-uri profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-prof-2.6.4.2-2.3.aarch64.rpm"
RPM_HASH = "1ca6b097e1b8e439cd64b78d67b81b5ad70848f7dc27a3d72be7ecc92918e8c61730745c6ac217852d2caf793a35d1a2dc61958f166732fb2c3521cdbfb1390f"

RPROVIDES:${PN} += "ghc-network-uri-prof \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH"

RDEPENDS:${PN} += "ghc-network-uri-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv"

inherit rpm
