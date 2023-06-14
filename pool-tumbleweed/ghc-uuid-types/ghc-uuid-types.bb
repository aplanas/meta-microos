SUMMARY = "Type definitions for Universally Unique Identifiers"
DESCRIPTION = "This library contains type definitions for <https://en.wikipedia.org/wiki/UUID \
Universally Unique Identifiers (UUID)> (as specified in \
<http://tools.ietf.org/html/rfc4122 RFC 4122>) and basic conversion functions. \
 \
See also the <https://hackage.haskell.org/package/uuid 'uuid' package> \
providing a high-level API for managing the different UUID versions."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-uuid-types-1.0.5-5.2.aarch64.rpm"
RPM_HASH = "e9bada0bb0023de3636dda901102fabc9c826d0ddd004d42f0688255692fdfc95e0b69f1ddc9da5ff2701aac0f4230d695dbefdf8b1a8dd7ab2008589715e8b9"

RPROVIDES:${PN} += "ghc-uuid-types \
libHSuuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
