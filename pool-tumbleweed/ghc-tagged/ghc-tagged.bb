SUMMARY = "Haskell 98 phantom types to avoid unsafely passing dummy arguments"
DESCRIPTION = "Haskell 98 phantom types to avoid unsafely passing dummy arguments."
LICENSE = "BSD-3-Clause"

PV = "0.8.8"

RPM_NAME = "ghc-tagged-0.8.8-1.2.aarch64.rpm"
RPM_HASH = "2a82a1574151137e7d0d195611e8447c4aa70cb31cbcfccc1499ace53a05edd6fa1fda6dd1a7a9b2a0af6032068cb7566214db03859e71f86be115a05fca7b6f"

RPROVIDES:${PN} += "ghc-tagged \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
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
