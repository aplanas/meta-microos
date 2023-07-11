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

RPM_NAME = "ghc-vector-0.13.0.0-1.6.aarch64.rpm"
RPM_HASH = "31de270d0f20c285df962dbc8033b3482321c5bb59a57063f459a3ddeaeea98665b0247de5595b4771e787c391433de3a165cde0eaa29541e31a43918f990c31"

RPROVIDES:${PN} += "ghc-vector \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
