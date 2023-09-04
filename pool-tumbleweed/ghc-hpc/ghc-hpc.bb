SUMMARY = "Haskell hpc library"
DESCRIPTION = "This package provides the Haskell hpc library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-0.6.1.0-1.1.aarch64.rpm"
RPM_HASH = "0694abc1a9ebb36bbefd453dd26798c426742b5f93731fd2ebe71acc3e02a9b375de2d54b47d8af03065b6786cdd513fae90488c6f72677bfca8581242c5bc75"

RPROVIDES:${PN} += "ghc-hpc \
libHShpc-0.6.1.0-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
