SUMMARY = "Unix time parser/formatter and utilities"
DESCRIPTION = "Fast parser/formatter/utilities for Unix time."
LICENSE = "BSD-3-Clause"

PV = "0.4.10"

RPM_NAME = "ghc-unix-time-0.4.10-1.3.aarch64.rpm"
RPM_HASH = "77f261a6a18aaecf232c3b9d737ad70d86c9a66b77af4bb081b3604da07dc0ec545851a6d93c246e9a1d9ad98ee9a1bb6152e48c3cb1c806941734f7718b148b"

RPROVIDES:${PN} += "ghc-unix-time \
libHSunix-time-0.4.10-fuTENic3zHIuWAM5F0fYB-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so \
libHSold-time-1.1.0.3-EO4BkAubfN4CLCS9qF8OKw-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
