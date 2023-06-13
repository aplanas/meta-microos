SUMMARY = "Cryptographic library for Python"
DESCRIPTION = "PyCryptodome is a self-contained Python package of low-level \
cryptographic primitives. \
 \
PyCryptodome is a fork of PyCrypto, residing in the `Crypto` \
namespace for better drop-in compatibility, while it brings several \
enhancements with respect to the last official version of PyCrypto \
(2.6.1), for instance: \
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
PyCryptodome is not a wrapper to a separate C library like *OpenSSL*. \
To the largest possible extent, algorithms are implemented in pure \
Python. Only the pieces that are extremely critical to performance \
(e.g. block ciphers) are implemented as C extensions."
LICENSE = "BSD-2-Clause"

PV = "3.18.0"

RPM_NAME = "python311-pycryptodome-3.18.0-1.1.aarch64.rpm"
RPM_HASH = "36434a50d39ae782a16d00435acd99cd65de5c54e4c38ae82306892262f45ed7e29df1b48263adbd73e0bb164c0c91ba928995d0e46f654272114779fc79685b"

RPROVIDES:${PN} += "python3.11dist(pycryptodome) \
python311-pycrypto \
python311-pycryptodome \
python311-pycryptodome(aarch-64) \
python3dist(pycryptodome)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
