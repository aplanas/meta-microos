SUMMARY = "Efficient algorithms for vector arrays"
DESCRIPTION = "Efficient algorithms for sorting vector arrays. At some stage other vector \
algorithms may be added."
LICENSE = "BSD-3-Clause"

PV = "0.9.0.1"

RPM_NAME = "ghc-vector-algorithms-0.9.0.1-1.3.aarch64.rpm"
RPM_HASH = "5e5efd172b8b4ed7270a4daebf461d30ce1e15a27842f6786178fe6ef8c3e07028e7d5c116291c08d8d71829e7e1ca2ce05fb7c86a421bbcbc7d914f9fa7ac9e"

RPROVIDES:${PN} += "ghc-vector-algorithms \
libHSvector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
