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

RPM_NAME = "ghc-vector-0.13.0.0-1.3.aarch64.rpm"
RPM_HASH = "a0ebd0f410056929a62d24e7b10d49fcd529ef6b0905b4f68f0d009233a0c078e06f53c73b07c2c704ff3144221f14f5cc1c5b550ae3db6727e9bda201a01c70"

RPROVIDES:${PN} += "ghc-vector \
ghc-vector(aarch-64) \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
