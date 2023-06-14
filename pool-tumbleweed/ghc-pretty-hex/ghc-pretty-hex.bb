SUMMARY = "A library for hex dumps of ByteStrings"
DESCRIPTION = "This library generates pretty hex dumps of ByteStrings in the style of other \
common *nix hex dump tools."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-pretty-hex-1.1-4.2.aarch64.rpm"
RPM_HASH = "79ad4af2a2e0b716ca8d6f77ba24d9ae0f01ccd6e455703a43c262b82a1956736503347209b47f1f605f08c72536ec4c85e778ed83528c5aa23777ad32da0f85"

RPROVIDES:${PN} += "ghc-pretty-hex \
libHSpretty-hex-1.1-2861Nkv8pS0CIRpZJwwJMG-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
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
