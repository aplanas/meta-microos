SUMMARY = "Instances of Data.Binary for vector"
DESCRIPTION = "Instances for Binary for the types defined in the vector package, making it \
easy to serialize vectors to and from disk. We use the generic interface to \
vectors, so all vector types are supported. Specific instances are provided for \
unboxed, boxed and storable vectors. . To serialize a vector: . > \
*Data.Vector.Binary> let v = Data.Vector.fromList [1..10] > \
*Data.Vector.Binary> v > fromList [1,2,3,4,5,6,7,8,9,10] :: Data.Vector.Vector \
> *Data.Vector.Binary> encode v > Chunk \
'NULNULNULNULNUL...NULNULNULtNULNULNULNULn' Empty . Which you can in turn \
compress before writing to disk: . > compress . encode $ v > Chunk \
'US139bNULNULN...229240,254:NULNULNUL' Empty . Try the cereal-vector package if \
you are looking for Data.Serialize instances."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.2"

RPM_NAME = "ghc-vector-binary-instances-0.2.5.2-5.2.aarch64.rpm"
RPM_HASH = "0975770db53ef354937b379683d28bc171215b414ace4ca2bfb9c58e7ca565b3ad1432f78060047c8962ff9565bbca777c54c74635b53697c184b6cb04dab4ef"

RPROVIDES:${PN} += "ghc-vector-binary-instances \
ghc-vector-binary-instances(aarch-64) \
libHSvector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm