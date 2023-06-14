SUMMARY = "Fixpoint data types"
DESCRIPTION = "Fixpoint types and recursion schemes. If you define your AST as fixpoint type, \
you get fold and unfold operations for free. \
 \
Thanks for contribution to: Matej Kollar, Herbert Valerio Riedel."
LICENSE = "BSD-3-Clause"

PV = "0.3.2"

RPM_NAME = "ghc-data-fix-0.3.2-4.2.aarch64.rpm"
RPM_HASH = "4d620eed959ec35ef6ac3bf85a63f19407c1d70daa1137d3569563e7a48ce5698de8652c95c8d4f0d79c3e8d4c66635403b0545f1bc6039120ae2d60491dc8bd"

RPROVIDES:${PN} += "ghc-data-fix \
libHSdata-fix-0.3.2-LdyR2jsAdh33KJZuVTGWPw-ghc9.4.5.so"

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
