SUMMARY = "Levenshtein and restricted Damerau-Levenshtein edit distances"
DESCRIPTION = "Optimized edit distances for fuzzy matching, including Levenshtein and \
restricted Damerau-Levenshtein algorithms."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-0.2.2.1-13.3.aarch64.rpm"
RPM_HASH = "1719827cd93646c327989b0db6cdd1ba44b0e8247f090a72ae9c22fa920c81551aa8f3ca118ef556c2c2f7c9989406e86978af17bf6839be15cd48d1dacb6c6c"

RPROVIDES:${PN} += "ghc-edit-distance \
libHSedit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
