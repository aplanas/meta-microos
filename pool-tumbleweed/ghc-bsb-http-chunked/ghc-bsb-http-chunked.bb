SUMMARY = "Chunked HTTP transfer encoding for bytestring builders"
DESCRIPTION = "This library contains functions for encoding [bytestring \
builders](http://hackage.haskell.org/package/bytestring/docs/Data-ByteString-Builder.html#t:Builder) \
for [chunked HTTP/1.1 \
transfer](https://en.wikipedia.org/wiki/Chunked_transfer_encoding). \
 \
This functionality was extracted from the \
[blaze-builder](http://hackage.haskell.org/package/blaze-builder) package."
LICENSE = "BSD-3-Clause"

PV = "0.0.0.4"

RPM_NAME = "ghc-bsb-http-chunked-0.0.0.4-6.2.aarch64.rpm"
RPM_HASH = "849bf7a5a0868fcaf6d4ba0b55cafdf8970a90769c8b3c35a957ad257b972a954a98ae5996c5e0d5542a4b1b5e18a18c1c30e08687ff8286f2251151735f5ecc"

RPROVIDES:${PN} += "ghc-bsb-http-chunked \
libHSbsb-http-chunked-0.0.0.4-7TdDxnBU7De3tUquWdckvl-ghc9.4.5.so"

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
libm.so.6"

inherit rpm
