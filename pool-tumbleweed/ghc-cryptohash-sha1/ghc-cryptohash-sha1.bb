SUMMARY = "Fast, pure and practical SHA-1 implementation"
DESCRIPTION = "A practical incremental and one-pass, pure API to the \
<https://en.wikipedia.org/wiki/SHA-1 SHA-1 hash algorithm> (including \
<https://en.wikipedia.org/wiki/HMAC HMAC> support) with performance close to \
the fastest implementations available in other languages. \
 \
The implementation is made in C with a haskell FFI wrapper that hides the C \
implementation. \
 \
NOTE: This package has been forked off 'cryptohash-0.11.7' because the \
'cryptohash' package has been deprecated and so this package continues to \
satisfy the need for a lightweight package providing the SHA1 hash algorithm \
without any dependencies on packages other than 'base' and 'bytestring'. \
 \
Consequently, this package can be used as a drop-in replacement for \
'cryptohash''s 'Crypto.Hash.SHA1' module, though with a clearly smaller \
footprint."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-0.11.101.0-4.3.aarch64.rpm"
RPM_HASH = "0c53d2658a0e007908b795a74f65943e9c30d9a9ab9d947f910380f647855bac6bbc315d9ba90a8a23c3202d8366e4482b73d282367b8ee270d1655fd314faa3"

RPROVIDES:${PN} += "ghc-cryptohash-sha1 \
ghc-cryptohash-sha1(aarch-64) \
libHScryptohash-sha1-0.11.101.0-5MfQC56IvYq9IpSDMpmdHb-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
