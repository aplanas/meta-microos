SUMMARY = "Ed25519 cryptographic signatures"
DESCRIPTION = "This package provides a simple, fast, self-contained copy of the Ed25519 \
public-key signature system with a clean interface. It also includes support \
for detached signatures, and thorough documentation on the design and \
implementation, including usage guidelines."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-0.0.5.0-16.2.aarch64.rpm"
RPM_HASH = "e7de29a818df98f8d45209e5a964a973274b665f2ad44dd88f06d9271377f04fcb9e4f4605e5887447032da2872ff955c9047b28b5034f3a2ce12c43d220339c"

RPROVIDES:${PN} += "ghc-ed25519 \
libHSed25519-0.0.5.0-EkN6WeFwHLH4dNF4Xthto8-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
