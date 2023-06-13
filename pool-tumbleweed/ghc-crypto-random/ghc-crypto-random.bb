SUMMARY = "Simple cryptographic random related types"
DESCRIPTION = "Simple cryptographic random related types."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-0.0.9-5.3.aarch64.rpm"
RPM_HASH = "d5ba209663665681c5222bf3ea9520cec9c2746609c5a22f68b19d959df0ab72558481bd24dc7fc8f0a2fe959d9718103c037ffa52c3a9818919df3884100c5c"

RPROVIDES:${PN} += "ghc-crypto-random \
ghc-crypto-random(aarch-64) \
libHScrypto-random-0.0.9-JRbP8k0BmeXEHkvOdlpIfk-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so()(64bit) \
libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) \
libHSsecuremem-0.1.10-BbcWu3otOS6JQaPW3JfszZ-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
