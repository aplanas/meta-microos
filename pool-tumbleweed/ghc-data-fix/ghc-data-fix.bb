SUMMARY = "Fixpoint data types"
DESCRIPTION = "Fixpoint types and recursion schemes. If you define your AST as fixpoint type, \
you get fold and unfold operations for free. \
 \
Thanks for contribution to: Matej Kollar, Herbert Valerio Riedel."
LICENSE = "BSD-3-Clause"

PV = "0.3.2"

RPM_NAME = "ghc-data-fix-0.3.2-4.4.aarch64.rpm"
RPM_HASH = "ebe59035c61279e95750bdaee690ab753590d200a496ea62de7dc6509503db26d0d78ef1c5c23f3f80da2b2f9541ca55f39b871e43fedaddb08087335524be8a"

RPROVIDES:${PN} += "ghc-data-fix \
libHSdata-fix-0.3.2-Hesv2p3MUF3H2yKikhD4Es-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
