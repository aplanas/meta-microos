SUMMARY = "Various hashes for bytestrings; CRC32 and Adler32 for now"
DESCRIPTION = "This package provides efficient hash implementations for strict and lazy \
bytestrings. For now, CRC32 and Adler32 are supported; they are implemented as \
FFI bindings to efficient code from zlib."
LICENSE = "BSD-2-Clause"

PV = "0.0.1.7"

RPM_NAME = "ghc-digest-0.0.1.7-1.8.aarch64.rpm"
RPM_HASH = "3d3c422be5ea33b6aef62d5fae8e6d61dea5cbdc50481cd8cb638efaa75bf7aa3711e3992807356cfaa7b315ec6ab12a6579e30135753a95534597c12e9669ac"

RPROVIDES:${PN} += "ghc-digest \
libHSdigest-0.0.1.7-x22LVSWrXSB7L6QfE4JoE-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
