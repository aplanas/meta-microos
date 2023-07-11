SUMMARY = "Safe, consistent, and easy exception handling"
DESCRIPTION = "Safe, consistent, and easy exception handling."
LICENSE = "MIT"

PV = "0.1.7.4"

RPM_NAME = "ghc-safe-exceptions-0.1.7.4-1.1.aarch64.rpm"
RPM_HASH = "0c01df316af29ed5a4e026eeee2544a1de46aa2004a5d6dfd60d0043f8936470057cb6976d3629d2646cb56dfe3539e49c94aa9dbe6850cb21c63ca9fd7f1b2b"

RPROVIDES:${PN} += "ghc-safe-exceptions \
libHSsafe-exceptions-0.1.7.4-8XVKrMBchTjCLhdcvBwBNb-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
