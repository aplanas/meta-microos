SUMMARY = "Support for reading and writing UTF8 Strings"
DESCRIPTION = "A UTF8 layer for Strings. The utf8-string package provides operations for \
encoding UTF8 strings to Word8 lists and back, and for reading and writing UTF8 \
without truncation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-1.0.2-2.6.aarch64.rpm"
RPM_HASH = "b0eca5d44c1b3a18f58dcb0422ea64812e6f01fedf89d26545160d98df4d4b23f8c9c8df861ce32c42033fe2ee264833953423fe6bd4f55bdcd3ba11b7d30a39"

RPROVIDES:${PN} += "ghc-utf8-string \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so"

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
