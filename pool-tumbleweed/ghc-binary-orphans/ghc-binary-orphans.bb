SUMMARY = "Compatibility package for binary; provides instances"
DESCRIPTION = "This package provides instances defined in later versions of 'binary' package \
 \
Prior version 1 this packages provided instances for other packages. \
That functionality is moved to \
[binary-instances](https://hackage.haskell.org/package/binary-instances) \
package."
LICENSE = "BSD-3-Clause"

PV = "1.0.4.1"

RPM_NAME = "ghc-binary-orphans-1.0.4.1-1.3.aarch64.rpm"
RPM_HASH = "e74e731ef14d4d1da2c73d59c26020fa345399cffa81c46c64e08cf282589c79678bc95e893158fcb5c6ff2e614ac42c851308a3e0bbcca25e6b387d5fe3611d"

RPROVIDES:${PN} += "ghc-binary-orphans \
libHSbinary-orphans-1.0.4.1-8AxRlqguR7DABM6SJeuldT-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
