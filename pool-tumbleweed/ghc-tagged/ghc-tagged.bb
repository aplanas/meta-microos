SUMMARY = "Haskell 98 phantom types to avoid unsafely passing dummy arguments"
DESCRIPTION = "Haskell 98 phantom types to avoid unsafely passing dummy arguments."
LICENSE = "BSD-3-Clause"

PV = "0.8.7"

RPM_NAME = "ghc-tagged-0.8.7-1.3.aarch64.rpm"
RPM_HASH = "55dbb03faa8c982c8e6dbc405bb7c717066c1be4be37d18a43183cceebfd29ad5d7a5f9bf5617b1a2ef795c96d5ee614c48f36aef78397f9ab220eac7926453c"

RPROVIDES:${PN} += "ghc-tagged \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so"

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
