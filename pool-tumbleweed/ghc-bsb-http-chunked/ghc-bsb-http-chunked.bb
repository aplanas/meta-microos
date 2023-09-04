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

RPM_NAME = "ghc-bsb-http-chunked-0.0.0.4-6.3.aarch64.rpm"
RPM_HASH = "c5438a10c0bfad2eca79c5bcbe94f83eea29f61a602dabb6adac44714dd0697d3b990e15ac8f2a0a9f5a8656c0d7479eb18bbc99f925fdd4388bf07728e1dcbe"

RPROVIDES:${PN} += "ghc-bsb-http-chunked \
libHSbsb-http-chunked-0.0.0.4-6Uz6ZfX3tBC2nOluTU0Lnf-ghc9.4.6.so"

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
libm.so.6"

inherit rpm
