SUMMARY = "A variety of alternative parser combinator libraries"
DESCRIPTION = "This version, 1.13 is a Non-Maintainer Upload (NMU). Report issues to the \
Hackage Trustees issue tracker. \
 \
A variety of alternative parser combinator libraries, including the original \
HuttonMeijer set. The Poly sets have features like good error reporting, \
arbitrary token type, running state, lazy parsing, and so on. Finally, \
Text.Parse is a proposed replacement for the standard Read class, for better \
deserialisation of Haskell values from Strings."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-1.13-11.1.aarch64.rpm"
RPM_HASH = "4666f5bf020b340fe8a971031fbb2207a879e22c701aa870d6cb4f98d0e9e67c5a984c69947a7ae6b28c3a69492e857d83021bbe708d4606e2280b0b959b28b2"

RPROVIDES:${PN} += "ghc-polyparse \
libHSpolyparse-1.13-E8FdqtcSqxM3P2njDFrYm8-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
