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

PV = "41.0.3"

RPM_NAME = "python310-cryptography-41.0.3-1.1.aarch64.rpm"
RPM_HASH = "d29888fb2498c74613f8aa9e77346134da7a046e7c8f301bef04b21171c8e11694d2b2a7406b19e20aa6b2162401f7477ed985830f7705672bed8b8c2fc680d0"

RPROVIDES:${PN} += "python3.10dist-cryptography \
python310-cryptography \
python3dist-cryptography"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
python-abi \
python310 \
python310-cffi"

inherit rpm
