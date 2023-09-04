SUMMARY = "Levenshtein and restricted Damerau-Levenshtein edit distances"
DESCRIPTION = "Optimized edit distances for fuzzy matching, including Levenshtein and \
restricted Damerau-Levenshtein algorithms."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-0.2.2.1-13.8.aarch64.rpm"
RPM_HASH = "88d226ba3e4efbc330c84ba1d617753c717965f6af735dd046befa82a8338c24a98ee2b8c537a879b1fbd8dfec95a88e23caf83fdb9891be71da83759f001188"

RPROVIDES:${PN} += "ghc-edit-distance \
libHSedit-distance-0.2.2.1-ITBK6JvlsOE36MkOzN30LX-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
