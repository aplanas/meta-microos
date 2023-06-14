SUMMARY = "A logging system for WAI"
DESCRIPTION = "A logging system for WAI."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-2.4.0-2.3.aarch64.rpm"
RPM_HASH = "9d77b61472bcf586ef0b49add3c1b4f55fa8fc3fb32552ca6af3fdc7cfe2546fc4c01ba205b16d19316c9f40363637be05304972996a0da098372b655caea4d4"

RPROVIDES:${PN} += "ghc-wai-logger \
libHSwai-logger-2.4.0-9XzUYLocOmA4DcbxilrxA0-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSauto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbyteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSeasy-file-0.2.3-Bwh7vXkS9r2GpL1fsuKjo4-ghc9.4.5.so \
libHSfast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHShttp-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6-ghc9.4.5.so \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so \
libHSold-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSunix-compat-0.6-79KxxZMmklx25hsmeEnenN-ghc9.4.5.so \
libHSunix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSvault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc-ghc9.4.5.so \
libHSwai-3.2.3-LsLg4DRwusRI7b3SRdjDzn-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
