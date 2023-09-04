SUMMARY = "Efficient Arrays"
DESCRIPTION = "An efficient implementation of 'Int'-indexed arrays (both mutable and \
immutable), with a powerful loop optimisation framework . \
 \
It is structured as follows: \
 \
['Data.Vector'] Boxed vectors of arbitrary types. \
 \
['Data.Vector.Unboxed'] Unboxed vectors with an adaptive representation based \
on data type families. \
 \
['Data.Vector.Storable'] Unboxed vectors of 'Storable' types. \
 \
['Data.Vector.Primitive'] Unboxed vectors of primitive types as defined by the \
'primitive' package. 'Data.Vector.Unboxed' is more flexible at no performance \
cost. \
 \
['Data.Vector.Generic'] Generic interface to the vector types. \
 \
There is also a (draft) tutorial on common uses of vector. \
 \
* <http://haskell.org/haskellwiki/Numeric_Haskell:_A_Vector_Tutorial>."
LICENSE = "BSD-3-Clause"

PV = "0.13.0.0"

RPM_NAME = "ghc-vector-0.13.0.0-3.2.aarch64.rpm"
RPM_HASH = "33ed42f3dfadf747dd44a7dbcd605309a89b33ac6d2c7cbe33d842e60073fd118665cca4c8225e6c2e9b3b6a1e1dc62d26735839599eeea9981259b8ce991382"

RPROVIDES:${PN} += "ghc-vector \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so"

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
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
