SUMMARY = "Fast, pure and practical SHA-256 implementation"
DESCRIPTION = "A practical incremental and one-pass, pure API to the [SHA-256 cryptographic \
hash algorithm](https://en.wikipedia.org/wiki/SHA-2) according to [FIPS \
180-4](http://dx.doi.org/10.6028/NIST.FIPS.180-4) with performance close to the \
fastest implementations available in other languages. \
 \
The core SHA-256 algorithm is implemented in C and is thus expected to be as \
fast as the standard [sha256sum(1) \
tool](https://linux.die.net/man/1/sha256sum); for instance, on an /Intel Core \
i7-3770/ at 3.40GHz this implementation can compute a SHA-256 hash over 230 MiB \
of data in under one second. (If, instead, you require a pure Haskell \
implementation and performance is secondary, please refer to the [SHA \
package](https://hackage.haskell.org/package/SHA).) \
 \
Additionally, this package provides support for \
 \
- HMAC-SHA-256: SHA-256-based [Hashed Message Authentication \
Codes](https://en.wikipedia.org/wiki/HMAC) (HMAC) - HKDF-SHA-256: \
[HMAC-SHA-256-based Key Derivation \
Function](https://en.wikipedia.org/wiki/HKDF) (HKDF) \
 \
conforming to [RFC6234](https://tools.ietf.org/html/rfc6234), \
[RFC4231](https://tools.ietf.org/html/rfc4231), \
[RFC5869](https://tools.ietf.org/html/rfc5869), et al.. \
 \
=== Relationship to the 'cryptohash' package and its API \
 \
This package has been originally a fork of 'cryptohash-0.11.7' because the \
'cryptohash' package had been deprecated and so this package continues to \
satisfy the need for a lightweight package providing the SHA-256 hash algorithm \
without any dependencies on packages other than 'base' and 'bytestring'. \
The API exposed by 'cryptohash-sha256-0.11.*''s 'Crypto.Hash.SHA256' module is \
guaranteed to remain a compatible superset of the API provided by the \
'cryptohash-0.11.7''s module of the same name. \
 \
Consequently, this package is designed to be used as a drop-in replacement for \
'cryptohash-0.11.7''s 'Crypto.Hash.SHA256' module, though with a [clearly \
smaller footprint by almost 3 orders of \
magnitude](https://www.reddit.com/r/haskell/comments/5lxv75/psa_please_use_unique_module_names_when_uploading/dbzegx3/)."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-0.11.102.1-3.3.aarch64.rpm"
RPM_HASH = "f1b5100e8c8f1abdf818d9888cbcfbac18636e8be1f970a6e14f3da8d996dff9f575c7339511ed4bad204bdfb4a9298d1dbb0b53dff16ee6745bafc219b35437"

RPROVIDES:${PN} += "ghc-cryptohash-sha256 \
libHScryptohash-sha256-0.11.102.1-Hqbk8cbDzn9JgCAqvbhMBD-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.5.so \
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
