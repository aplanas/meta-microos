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

RPM_NAME = "ghc-cryptonite-0.30-2.3.aarch64.rpm"
RPM_HASH = "f8f7001f0ad6679649d717d7de2e78bc68823b7db62abb71bddbf2b831a0d100ba61d2ff0e1c588877393b27f6dc7fd8cb34bef599ab75da5a98df55f25fef67"

RPROVIDES:${PN} += "ghc-cryptonite ghc-cryptonite(aarch-64) libHScryptonite-0.30-AbDFzA14dNKDfU9pLpBLye-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSinteger-gmp-1.1-ghc9.4.5.so()(64bit) libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
