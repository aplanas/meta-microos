SUMMARY = "RFC 4648-compliant Base16 encodings for ByteStrings"
DESCRIPTION = "This package provides support for encoding and decoding binary data according \
to 'base16' (see also <https://tools.ietf.org/html/rfc4648 RFC 4648>) for \
strict (see 'Data.ByteString.Base16') and lazy 'ByteString's (see \
'Data.ByteString.Base16.Lazy'). \
 \
See the <https://hackage.haskell.org/package/base16 base16> package which \
provides superior encoding and decoding performance as well as support for \
lazy, short, and strict variants of 'Text' and 'ByteString' values. \
Additionally, see the <https://hackage.haskell.org/package/base-encoding \
base-encoding> package which provides an uniform API providing conversion paths \
between more binary and textual types."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.0"

RPM_NAME = "ghc-base16-bytestring-1.0.2.0-2.3.aarch64.rpm"
RPM_HASH = "782ec8639630087fc7f6733c47c1e37a7d68460594283a5f591f36045afc0f032e45fbf1c3e726c07935b6421c05b676fa1c3c931cbb624071fadb1fdd10d1ca"

RPROVIDES:${PN} += "ghc-base16-bytestring \
libHSbase16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ-ghc9.4.6.so"

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
