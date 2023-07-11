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

RPM_NAME = "ghc-zlib-0.6.3.0-2.6.aarch64.rpm"
RPM_HASH = "19d323b7748d811bb34c89465f46fbf85f791c2a617a2d570c84fb6a73d9f31b6dace2ad56a6e86b71ee6ab268726689af0ce6c0c7411663eadcc962f5e20efe"

RPROVIDES:${PN} += "ghc-zlib \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so"

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
