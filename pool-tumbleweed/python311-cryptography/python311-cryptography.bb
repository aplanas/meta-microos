SUMMARY = "Python library which exposes cryptographic recipes and primitives"
DESCRIPTION = "cryptography is a package designed to expose cryptographic \
recipes and primitives to Python developers.  Our goal is \
for it to be your 'cryptographic standard library'. It \
supports Python 2.7, Python 3.4+, and PyPy-5.3+. \
 \
cryptography includes both high level recipes, and low \
level interfaces to common cryptographic algorithms such as \
symmetric ciphers, message digests and key derivation \
functions."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "41.0.2"

RPM_NAME = "python311-cryptography-41.0.2-1.1.aarch64.rpm"
RPM_HASH = "dc11394156398b881250563dee4edc589a2e6490ec62b3f2e7182b96c3863782f772d1b84a7a03258332a3c169709091426e3ab2172ee85a437084548c513cde"

RPROVIDES:${PN} += "python3-cryptography \
python3.11dist-cryptography \
python311-cryptography \
python3dist-cryptography"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
python-abi \
python311 \
python311-cffi"

inherit rpm
