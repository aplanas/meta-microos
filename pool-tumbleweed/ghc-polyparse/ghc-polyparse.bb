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

RPM_NAME = "ghc-polyparse-1.13-13.1.aarch64.rpm"
RPM_HASH = "896cf8276c23c5037afa6554f9a17cf60994d4d828e4e9c9ae6b4b7587b7ce497c24f261f162a6cfef626e61ca661231f987cc17b6bf0f22ac8242434fd383e8"

RPROVIDES:${PN} += "ghc-polyparse \
libHSpolyparse-1.13-BLB26XAC1GDzZMBJpPaUe-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
