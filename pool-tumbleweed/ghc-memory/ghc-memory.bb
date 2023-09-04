SUMMARY = "Memory and related abstraction stuff"
DESCRIPTION = "Chunk of memory, polymorphic byte array management and manipulation \
 \
* A polymorphic byte array abstraction and function similar to strict \
ByteString. \
 \
* Different type of byte array abstraction. \
 \
* Raw memory IO operations (memory set, memory copy, ..) \
 \
* Aliasing with endianness support. \
 \
* Encoding : Base16, Base32, Base64. \
 \
* Hashing : FNV, SipHash."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-0.18.0-2.9.aarch64.rpm"
RPM_HASH = "6a575ac0494978a9375fec829b27b9131340e27c404ea3f0289539565187cb236a889f45bf58aed97c713f7f4b0a3a29e15be3bd14b72e9f60776c64c3e4d22c"

RPROVIDES:${PN} += "ghc-memory \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
