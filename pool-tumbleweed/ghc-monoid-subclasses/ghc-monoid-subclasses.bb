SUMMARY = "Subclasses of Monoid"
DESCRIPTION = "A hierarchy of subclasses of 'Monoid' together with their instances for all \
data structures from base, containers, and text packages."
LICENSE = "BSD-3-Clause"

PV = "1.2.3"

RPM_NAME = "ghc-monoid-subclasses-1.2.3-1.7.aarch64.rpm"
RPM_HASH = "56d54008d585308fa1071aa211143faf783e9cf798e9727a5edba951503b04e319b5b4f5ed5dfd94823cd06776fc095bae9d5fbabdbd045125129f1ea8f866eb"

RPROVIDES:${PN} += "ghc-monoid-subclasses \
libHSmonoid-subclasses-1.2.3-3ZmDzuybbdXkWlfa352KR-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScommutative-semigroups-0.1.0.1-EHuCShtv7U46wPCL9foais-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimes-0.2.1.0-EDehUtw1pOPPL7EktYCRg-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
