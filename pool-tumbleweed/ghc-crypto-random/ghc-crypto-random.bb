SUMMARY = "Simple cryptographic random related types"
DESCRIPTION = "Simple cryptographic random related types."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-0.0.9-6.1.aarch64.rpm"
RPM_HASH = "a228132fbb7059fef2b6738a1f66302f720c1c7d828a98dcbe05fa9144c1b5c04c929bb45a1b31b2049fbddae0154886dd627409ac3aa2acd0f035970a51c770"

RPROVIDES:${PN} += "ghc-crypto-random \
libHScrypto-random-0.0.9-60vlsiR41hHGmZ9VjOCRvw-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so \
libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmemory-0.18.0-8CsggfkyXReDSMbRoae4Yp-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSsecuremem-0.1.10-14D6arGPELi9Mzd7V4Fyfu-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
