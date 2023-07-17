SUMMARY = "Unix time parser/formatter and utilities"
DESCRIPTION = "Fast parser/formatter/utilities for Unix time."
LICENSE = "BSD-3-Clause"

PV = "0.4.10"

RPM_NAME = "ghc-unix-time-0.4.10-1.1.aarch64.rpm"
RPM_HASH = "2074557749227a58b82521316cdc490244d8cd8202b4c33d8311349745b0a8da9c7c33e99bf8ddaffea6e805a631cc54790bae59de49300be2f36b1b81a61ae3"

RPROVIDES:${PN} += "ghc-unix-time \
libHSunix-time-0.4.10-LpZG5YAXe572FFFZnKOLQq-ghc9.4.5.so"

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
