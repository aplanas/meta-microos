SUMMARY = "Fast, pure and practical MD5 implementation"
DESCRIPTION = "A practical incremental and one-pass, pure API to the \
<https://en.wikipedia.org/wiki/MD5 MD5 hash algorithm> (including \
<https://en.wikipedia.org/wiki/HMAC HMAC> support) with performance close to \
the fastest implementations available in other languages. \
 \
The implementation is made in C with a haskell FFI wrapper that hides the C \
implementation. \
 \
NOTE: This package has been forked off 'cryptohash-0.11.7' because the \
'cryptohash' package has been deprecated and so this package continues to \
satisfy the need for a lightweight package providing the MD5 hash algorithm \
without any dependencies on packages other than 'base' and 'bytestring'. \
 \
Consequently, this package can be used as a drop-in replacement for \
'cryptohash''s 'Crypto.Hash.MD5' module, though with a clearly smaller \
footprint."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-0.11.101.0-4.8.aarch64.rpm"
RPM_HASH = "adc2ffc1d3cf433a938733e38aa2591c8ecd4dd0b955e2b2b42a3d5d20f7b21eecc955913c634b2be8b770e4736616f94ca497b63d56faf16bde25128ed4de58"

RPROVIDES:${PN} += "ghc-cryptohash-md5 \
libHScryptohash-md5-0.11.101.0-DA2NKKN1mDy6fcPl6be7xQ-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.6.so \
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
