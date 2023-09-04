SUMMARY = "Unicode normalization"
DESCRIPTION = "Fast Unicode 14.0.0 normalization in Haskell (NFC, NFKC, NFD, NFKD)."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-0.4.0.1-4.8.aarch64.rpm"
RPM_HASH = "1237d24b28d115066bd81298357cb76a5cee33e18d4165641e319bf04f94c2f52198ae09cf0ad01d542d64c7fb7289b12c0cfcbc439311e23c343eef975c024d"

RPROVIDES:${PN} += "ghc-unicode-transforms \
libHSunicode-transforms-0.4.0.1-64QTLPchVoAx7KWqlUk24-ghc9.4.6.so"

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
libHSunicode-data-0.4.0.1-DXmKFuEq71jAHQO9x7NPr-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
