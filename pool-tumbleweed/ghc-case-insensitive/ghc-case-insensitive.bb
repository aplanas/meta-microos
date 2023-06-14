SUMMARY = "Case insensitive string comparison"
DESCRIPTION = "The module 'Data.CaseInsensitive' provides the 'CI' type constructor which can \
be parameterised by a string-like type like: 'String', 'ByteString', 'Text', \
etc.. Comparisons of values of the resulting type will be insensitive to cases."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-case-insensitive-1.2.1.0-6.2.aarch64.rpm"
RPM_HASH = "b23a2f09330501173d038387d7a5a30c3f520a2593ea02fe960c45295be91262ae8a7340e1172f7b899aecacfc9157e003960e20217d3e9fc7d216df54ade332"

RPROVIDES:${PN} += "ghc-case-insensitive \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
