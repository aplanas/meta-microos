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

RPM_NAME = "ghc-vector-binary-instances-0.2.5.2-6.1.aarch64.rpm"
RPM_HASH = "c8dbd3e4e4817cf3760cf6ed4eef9965a98fc89d2237f988baab82f923c2a005badb6463d63f5999db2bbafe36ad9b59ea95d4e3f47329c35d7120b011ef1b4b"

RPROVIDES:${PN} += "ghc-vector-binary-instances \
libHSvector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
