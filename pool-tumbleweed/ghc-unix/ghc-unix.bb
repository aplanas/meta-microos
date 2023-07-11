SUMMARY = "Haskell unix library"
DESCRIPTION = "This package provides the Haskell unix library."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-2.7.3-3.2.aarch64.rpm"
RPM_HASH = "e152334876d124b6484e150607c984ccfebd828aba7a2de65806b3d77212c3a664ee4a960f4e3bdef6d4e6d273467be3b25e0284330e5b425d4a3cf22edf8553"

RPROVIDES:${PN} += "ghc-unix \
libHSunix-2.7.3-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
