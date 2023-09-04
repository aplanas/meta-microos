SUMMARY = "Ed25519 cryptographic signatures"
DESCRIPTION = "This package provides a simple, fast, self-contained copy of the Ed25519 \
public-key signature system with a clean interface. It also includes support \
for detached signatures, and thorough documentation on the design and \
implementation, including usage guidelines."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-0.0.5.0-16.4.aarch64.rpm"
RPM_HASH = "cb86e3f8e07f2a87b61df14474329e787f18e557aeed2a372ad6571ce302eddee441ef09fb1251d40216f960f09b7137783846fd5b61f8ecc48d327236a28a97"

RPROVIDES:${PN} += "ghc-ed25519 \
libHSed25519-0.0.5.0-5X6chYMa5zJHtTD7kmYRr0-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
