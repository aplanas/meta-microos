SUMMARY = "Type level booleans"
DESCRIPTION = "Type level booleans. \
 \
'singletons' package provides similar functionality, but it has tight \
dependency constraints."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-singleton-bool-0.1.6-4.4.aarch64.rpm"
RPM_HASH = "af9ee2b210d1e48afcb2fc7d9b3bac65f2cfe8d4de5e75f3c4dde07ca75f828521d64603b2e9c752f687058acb67a5f8b2adaccc6eb592ed6e64841b1b19a1d2"

RPROVIDES:${PN} += "ghc-singleton-bool \
libHSsingleton-bool-0.1.6-32zI19nhSdNCZbR5BPJbeE-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSboring-0.2.1-8UoR96J8uAp13B13xTdCnI-ghc9.4.6.so \
libHSdec-0.0.5-3eH9is9HBV5IuOX3KX0Ah7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSsome-1.0.5-EryUniFNYOB2ktd7SoyKUW-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
