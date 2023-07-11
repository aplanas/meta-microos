SUMMARY = "Primitive memory-related operations"
DESCRIPTION = "This package provides various primitive memory-related operations."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.0"

RPM_NAME = "ghc-primitive-0.7.4.0-1.6.aarch64.rpm"
RPM_HASH = "30c42f0cf9b64bb7a50b19e33ab1d10ad3fc7897544b58c87840c52c881ff3fffe5cb6c6cdfdacac16ad102c6645a63a3cf0bf6efb880fade488b89d40774ee4"

RPROVIDES:${PN} += "ghc-primitive \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
