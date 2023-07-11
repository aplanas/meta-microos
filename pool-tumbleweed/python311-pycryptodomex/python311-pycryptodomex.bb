SUMMARY = "Cryptographic library for Python"
DESCRIPTION = "PyCryptodomex is a self-contained Python package of low-level \
cryptographic primitives. \
 \
Unlike PyCryptodome, it resides in its own namespace `Cryptodome`. \
 \
PyCryptodome is a fork of PyCrypto. It brings several enhancements \
with respect to the last official version of PyCrypto (2.6.1), \
for instance: \
 \
* Authenticated encryption modes (GCM, CCM, EAX, SIV, OCB) \
* Accelerated AES on Intel platforms via AES-NI \
* First class support for PyPy \
* Elliptic curves cryptography (NIST P-256 curve only) \
* Better and more compact API (`nonce` and `iv` attributes for \
  ciphers, automatic generation of random nonces and IVs, simplified \
  CTR cipher mode, and more) \
* SHA-3 (including SHAKE XOFs), SHA-512/t and BLAKE2 hash algorithms \
* Salsa20 and ChaCha20 stream ciphers \
* Poly1305 MAC \
* ChaCha20-Poly1305 authenticated cipher \
* scrypt and HKDF \
* Deterministic (EC)DSA \
* Password-protected PKCS#8 key containers \
* Shamir's Secret Sharing scheme \
* Random numbers get sourced directly from the OS (and not from a \
  CSPRNG in userspace) \
* Simplified install process, including better support for Windows \
* Cleaner RSA and DSA key generation (largely based on FIPS 186-4) \
* Major clean ups and simplification of the code base \
 \
PyCryptodomex is not a wrapper to a separate C library like *OpenSSL*. \
To the largest possible extent, algorithms are implemented in pure \
Python. Only the pieces that are extremely critical to performance \
(e.g. block ciphers) are implemented as C extensions."
LICENSE = "BSD-2-Clause"

PV = "3.18.0"

RPM_NAME = "python311-pycryptodomex-3.18.0-2.1.aarch64.rpm"
RPM_HASH = "1a95c803d5755f2dbe8963f64d3cd55bf59ee55e31ed4a9ee0ec4560e0e03bcb83751668026be3fe197f6e40c206a8a91d86e3d28fcee2c3b5b9b447287f89ab"

RPROVIDES:${PN} += "python3-pycryptodomex \
python3.11dist-pycryptodomex \
python311-pycryptodomex \
python3dist-pycryptodomex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
