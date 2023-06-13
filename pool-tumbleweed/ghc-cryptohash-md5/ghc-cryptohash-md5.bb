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

RPM_NAME = "ghc-cryptohash-md5-0.11.101.0-4.3.aarch64.rpm"
RPM_HASH = "96dc7e1a1ab99ca8af68c5447e0ea2483a09ce68e4a2f70eb1f9c0f6f7b8fe043cb9843822edbd2284add4ae8eb189d59dae4be9dc00f346f3209db9f2e71e4c"

RPROVIDES:${PN} += "ghc-cryptohash-md5 \
ghc-cryptohash-md5(aarch-64) \
libHScryptohash-md5-0.11.101.0-1tswcJp9v68CZlxGZzmcPV-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
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
