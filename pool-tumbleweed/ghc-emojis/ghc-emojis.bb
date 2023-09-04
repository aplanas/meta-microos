SUMMARY = "Conversion between emoji characters and their names"
DESCRIPTION = "This package provides functions for converting emoji names to emoji characters \
and vice versa. \
 \
How does it differ from the 'emoji' package? \
 \
- It supports a fuller range of emojis, including all those supported by GitHub \
- It supports lookup of emoji aliases from emoji - It uses Text rather than \
String - It has a lighter dependency footprint: in particular, it does not \
require aeson - It does not require TemplateHaskell."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-emojis-0.1.3-1.2.aarch64.rpm"
RPM_HASH = "d8c65f044ec6f19dbc413ad0e4f1e45915022f50ad7d13dab6e2013f51b1a179fd4473e8936d0b1252e8e94f2609187a88c75f255a92acda9353911a73eea125"

RPROVIDES:${PN} += "ghc-emojis \
libHSemojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK-ghc9.4.6.so"

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
