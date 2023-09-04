SUMMARY = "Compression and decompression in the gzip and zlib formats"
DESCRIPTION = "This package provides a pure interface for compressing and decompressing \
streams of data represented as lazy 'ByteString's. It uses the \
<https://en.wikipedia.org/wiki/Zlib zlib C library> so it has high performance. \
It supports the 'zlib', 'gzip' and 'raw' compression formats. \
 \
It provides a convenient high level API suitable for most tasks and for the few \
cases where more control is needed it provides access to the full zlib feature \
set."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-0.6.3.0-4.2.aarch64.rpm"
RPM_HASH = "289904a6e4ea511989c2514cecb6d9c0e60305f78a810624030da7e43f1a3025a0e4abbfc4a7de3b607459fd5ade181330190c557535eb95580df9a49b619899"

RPROVIDES:${PN} += "ghc-zlib \
libHSzlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj-ghc9.4.6.so"

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
