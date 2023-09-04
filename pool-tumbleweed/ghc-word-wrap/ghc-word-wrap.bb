SUMMARY = "A library for word-wrapping"
DESCRIPTION = "A library for wrapping long lines of text."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-word-wrap-0.5-2.3.aarch64.rpm"
RPM_HASH = "d206f0036c95c17e667975103af41af593779c968b65ea2ceaa056c9a861b13423129391d890457e735b344326d28d947c0fc9adbd368756f7c76b940f132214"

RPROVIDES:${PN} += "ghc-word-wrap \
libHSword-wrap-0.5-6mKx5HwYguB2E3kl2rrPmY-ghc9.4.6.so"

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
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
