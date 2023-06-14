SUMMARY = "A simple applicative parser"
DESCRIPTION = "A simple applicative parser in Parsec style."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-appar-0.1.8-4.2.aarch64.rpm"
RPM_HASH = "7be75ae3bb1622397b2cd80fb9fbbd65f6e4ba88c07486df57938c46a8a71ada636c5a434b96891ffab49a6a9677ce2028a2f108cf610835bf9784c72f8d817c"

RPROVIDES:${PN} += "ghc-appar \
libHSappar-0.1.8-JYpyJYPkUOgKorqU8WSWRv-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
