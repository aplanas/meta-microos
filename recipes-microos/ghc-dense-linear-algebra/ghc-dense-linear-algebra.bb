SUMMARY = "Simple and incomplete pure haskell implementation of linear algebra"
DESCRIPTION = "This library is simply collection of linear-algebra related modules split from \
statistics library."
LICENSE = "BSD-2-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-dense-linear-algebra-0.1.0.0-3.3.aarch64.rpm"
RPM_HASH = "2f9d60d6c2f09764b13808852ac0a5eaa480ec6438c6893428dace8797d9cd69868be79c5c308eaf27f9ac77cf772f5d9c96418c99d8ef41871f472ba82a5a5d"

RPROVIDES:${PN} += "ghc-dense-linear-algebra ghc-dense-linear-algebra(aarch-64) libHSdense-linear-algebra-0.1.0.0-2PBc2PrDutT32RQREBxCzn-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSmath-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) libHSvector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6-ghc9.4.5.so()(64bit) libHSvector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8-ghc9.4.5.so()(64bit) libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) libHSvector-th-unbox-0.2.2-8WH0ofCzoXcG1eDIxYKY6t-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
