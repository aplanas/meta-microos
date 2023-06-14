SUMMARY = "A fast logging system"
DESCRIPTION = "A fast logging system for Haskell."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-3.1.2-1.3.aarch64.rpm"
RPM_HASH = "dbfac03e6e273d258ceebab5e46d161c7d26fb9936537da15beb382570c6ce2b7e7223813b89c1be7b6c1adb4c4868d24005b22abb32b998c988e7f3b581b22b"

RPROVIDES:${PN} += "ghc-fast-logger \
libHSfast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSauto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSeasy-file-0.2.3-Bwh7vXkS9r2GpL1fsuKjo4-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so \
libHSold-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSunix-compat-0.6-79KxxZMmklx25hsmeEnenN-ghc9.4.5.so \
libHSunix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
