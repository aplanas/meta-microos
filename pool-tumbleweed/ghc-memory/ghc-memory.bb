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

RPM_NAME = "ghc-memory-0.18.0-2.3.aarch64.rpm"
RPM_HASH = "3cfd3f5ebac6346e9a46d9e07c9321ee04b215524a5715212e5ffbd380c4a918104dc910d7c1460622ed6a3386a08d231c56891cab81e4c477efb21f40f996a4"

RPROVIDES:${PN} += "ghc-memory \
ghc-memory(aarch-64) \
libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
