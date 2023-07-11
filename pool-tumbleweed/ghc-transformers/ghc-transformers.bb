SUMMARY = "Haskell transformers library"
DESCRIPTION = "This package provides the Haskell transformers library."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-0.5.6.2-3.2.aarch64.rpm"
RPM_HASH = "353431b88c2fa81d2192158f3f1abaeb4ba523f10b1999c3da899aa5329e60c0d5639cae6cb84f539ed773156d35a079c454826d0298997f009a16809bc0285a"

RPROVIDES:${PN} += "ghc-transformers \
libHStransformers-0.5.6.2-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
