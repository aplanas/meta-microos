SUMMARY = "Cryptography Primitives sink"
DESCRIPTION = "A repository of cryptographic primitives. \
 \
* Symmetric ciphers: AES, DES, 3DES, CAST5, Blowfish, Twofish, Camellia, RC4, \
Salsa, XSalsa, ChaCha. \
 \
* Hash: SHA1, SHA2, SHA3, SHAKE, MD2, MD4, MD5, Keccak, Skein, Ripemd, Tiger, \
Whirlpool, Blake2 \
 \
* MAC: HMAC, KMAC, Poly1305 \
 \
* Asymmetric crypto: DSA, RSA, DH, ECDH, ECDSA, ECC, Curve25519, Curve448, \
Ed25519, Ed448 \
 \
* Key Derivation Function: PBKDF2, Scrypt, HKDF, Argon2, BCrypt, BCryptPBKDF \
 \
* Cryptographic Random generation: System Entropy, Deterministic Random \
Generator \
 \
* Data related: Anti-Forensic Information Splitter (AFIS) \
 \
If anything cryptographic related is missing from here, submit a pull request \
to have it added. This package strives to be a cryptographic kitchen sink that \
provides cryptography for everyone. \
 \
Evaluate the security related to your requirements before using. \
 \
Read 'Crypto.Tutorial' for a quick start guide."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-0.30-2.8.aarch64.rpm"
RPM_HASH = "23b9bafee8a24c480b6a386312e8609a2b83153a2ab8d094e62cce2d796f12c1b316be4f86d5c7cd9978e2fb43c65e840a1eab4005da3599f118be6a787c5f72"

RPROVIDES:${PN} += "ghc-cryptonite \
libHScryptonite-0.30-LSC76M64GQaFgLGwFfgIgW-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSinteger-gmp-1.1-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
