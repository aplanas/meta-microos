SUMMARY = "Deriver for Data.Vector.Unboxed using Template Haskell"
DESCRIPTION = "A Template Haskell deriver for unboxed vectors, given a pair of coercion \
functions to and from some existing type with an Unbox instance. \
 \
Refer to 'Data.Vector.Unboxed.Deriving' for documentation and examples."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-vector-th-unbox-0.2.2-4.3.aarch64.rpm"
RPM_HASH = "56a3f15ab86c4a003068ede3665c7e781cf7e7e434fad820bd6f9708d8976a4d5f2fbb262c9a2da39248f4045df4ee4859f9d74798658cc40261262722e4e725"

RPROVIDES:${PN} += "ghc-vector-th-unbox \
libHSvector-th-unbox-0.2.2-4Hl5syaTqnL4b2rNrCiqzQ-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
