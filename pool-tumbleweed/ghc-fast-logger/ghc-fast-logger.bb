SUMMARY = "A fast logging system"
DESCRIPTION = "A fast logging system for Haskell."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-3.1.2-1.10.aarch64.rpm"
RPM_HASH = "3912af37cb9a638986c2ec1e77fb946f4a8eb817c6209e038b6d3deedd57c6df4bb65842f2ebe782c1b99cdd1f630e4d7fc521b4be3ba41173f35d368dbac9d4"

RPROVIDES:${PN} += "ghc-fast-logger \
libHSfast-logger-3.1.2-FrZhfcoVNTvDFmA3ecjq8Q-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSauto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSeasy-file-0.2.5-Eune3nGPx4BABAmiN3TyxF-ghc9.4.5.so \
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
libHSunix-time-0.4.10-LpZG5YAXe572FFFZnKOLQq-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
