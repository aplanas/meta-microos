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

RPM_NAME = "ghc-vector-binary-instances-0.2.5.2-6.2.aarch64.rpm"
RPM_HASH = "c6d3948652877c6b20d43412283d6e06863f994eb662eb5ea1b08b79c991d97eec1266f22afbbeee716c600ef63c1937038425d02c8aefe71b7740da49167faf"

RPROVIDES:${PN} += "ghc-vector-binary-instances \
libHSvector-binary-instances-0.2.5.2-DYVTg98S1IFCZ0TRySxTVW-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
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
