SUMMARY = "Pure Haskell commonmark parser"
DESCRIPTION = "This library provides some useful extensions to core commonmark syntax: smart \
quotes, definition lists, tables, footnotes, math, and more."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.4"

RPM_NAME = "ghc-commonmark-extensions-0.2.3.4-1.7.aarch64.rpm"
RPM_HASH = "3e3986d2e18c8063939c644fb651cd60a032a9e1dd8b19681ffde41795206eedde248be0ac0166d0263fc32c977a2011f9ea0bd3e0933e9028493c166ab4b44e"

RPROVIDES:${PN} += "ghc-commonmark-extensions \
libHScommonmark-extensions-0.2.3.4-lgOKfz42TuIWz23FZS91J-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScommonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSemojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO-ghc9.4.5.so \
libHSunicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
