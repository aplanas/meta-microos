SUMMARY = "Constraint manipulation"
DESCRIPTION = "GHC 7.4 gave us the ability to talk about 'ConstraintKinds'. They stopped \
crashing the compiler in GHC 7.6. \
 \
This package provides a vocabulary for working with them."
LICENSE = "BSD-2-Clause"

PV = "0.13.4"

RPM_NAME = "ghc-constraints-0.13.4-2.3.aarch64.rpm"
RPM_HASH = "efc34dfe9d9cf5ccf330031dcb02ff4c0728fa4b0ae71ee6c1366921a55ed43c5575f5a5917c46cf1ff4889c99a9706323505f51405111afabab35c57f0055bf"

RPROVIDES:${PN} += "ghc-constraints \
libHSconstraints-0.13.4-8c0InBhz3htJzug27IqVE7-ghc9.4.5.so"

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
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHStype-equality-1-FqVAbwBXnIKCXHvrA6xdY8-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
