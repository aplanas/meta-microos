SUMMARY = "Unix time parser/formatter and utilities"
DESCRIPTION = "Fast parser/formatter/utilities for Unix time."
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "ghc-unix-time-0.4.9-1.3.aarch64.rpm"
RPM_HASH = "a9c3fd6728d03810c24414287768a1da179c5e765a09677b7738ae36d6e73bb7d0b25e64a2a0708668ba885c898c72914a1c8017ba3137723b2d18ca392a1d98"

RPROVIDES:${PN} += "ghc-unix-time \
libHSunix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so \
libHSold-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
