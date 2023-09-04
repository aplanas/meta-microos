SUMMARY = "Haskell directory library"
DESCRIPTION = "This package provides the Haskell directory library."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-1.3.7.1-1.1.aarch64.rpm"
RPM_HASH = "b056fea939a3e6cf74dd57cef5ec772bd165127c9f06e8fe5f752212e30d7445b8102da52c9cd5d8b6bc46995da17405d1fd26a3759ada37a5681949bcb97b05"

RPROVIDES:${PN} += "ghc-directory \
libHSdirectory-1.3.7.1-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
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
