SUMMARY = "Haskell transformers library"
DESCRIPTION = "This package provides the Haskell transformers library."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-0.5.6.2-3.1.aarch64.rpm"
RPM_HASH = "0a7a2e55b2e6bcc5d376ef57d75f4a1a1ab73173cdabbafeab93f5bbd6c6e53617ec19f1f4d8a8294227fe1f739fd3c9cac7de6aec7476dd614407e14067a2b9"

RPROVIDES:${PN} += "ghc-transformers \
libHStransformers-0.5.6.2-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
