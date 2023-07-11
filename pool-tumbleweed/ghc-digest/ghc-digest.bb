SUMMARY = "Various hashes for bytestrings; CRC32 and Adler32 for now"
DESCRIPTION = "This package provides efficient hash implementations for strict and lazy \
bytestrings. For now, CRC32 and Adler32 are supported; they are implemented as \
FFI bindings to efficient code from zlib."
LICENSE = "BSD-2-Clause"

PV = "0.0.1.7"

RPM_NAME = "ghc-digest-0.0.1.7-1.6.aarch64.rpm"
RPM_HASH = "9a0d00bf7d8fea460b9a97b5658bee863ec318188089ee30824274cd2eec2fb30e1a3b0fe588a2c3faf54dd9da5fbb348727b70d3de8895d4800c760ada917d3"

RPROVIDES:${PN} += "ghc-digest \
libHSdigest-0.0.1.7-CCCN8814sFy3HuiyT8t94G-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
