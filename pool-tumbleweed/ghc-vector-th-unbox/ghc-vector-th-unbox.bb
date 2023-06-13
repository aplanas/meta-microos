SUMMARY = "Deriver for Data.Vector.Unboxed using Template Haskell"
DESCRIPTION = "A Template Haskell deriver for unboxed vectors, given a pair of coercion \
functions to and from some existing type with an Unbox instance. \
 \
Refer to 'Data.Vector.Unboxed.Deriving' for documentation and examples."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-vector-th-unbox-0.2.2-4.2.aarch64.rpm"
RPM_HASH = "ed4082bb8cb40edaccd2c8894f1da0b9052d511ac646c13f6cb230f13b41f64910ccf79012c04c47fa36f228adcac2ea2161985a2a52ec5590d69807a92b08d2"

RPROVIDES:${PN} += "ghc-vector-th-unbox \
ghc-vector-th-unbox(aarch-64) \
libHSvector-th-unbox-0.2.2-8WH0ofCzoXcG1eDIxYKY6t-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
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
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
