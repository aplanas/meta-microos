SUMMARY = "Collection of tools for numeric computations"
DESCRIPTION = "This library contain collection of various utilities for numerical computing. \
So far there're special mathematical functions, compensated summation \
algorithm, summation of series, root finding for real functions, polynomial \
summation and Chebyshev polynomials."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.2"

RPM_NAME = "ghc-math-functions-0.3.4.2-2.3.aarch64.rpm"
RPM_HASH = "020e09fb254a23c438c83ff6888c413355fe6337fb776a0e896c754fc41752fb7280a08825e6c0c6e66dfd2eb8a74304ec54675cf25d6e17011cafb859b3a0a1"

RPROVIDES:${PN} += "ghc-math-functions \
ghc-math-functions(aarch-64) \
libHSmath-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
