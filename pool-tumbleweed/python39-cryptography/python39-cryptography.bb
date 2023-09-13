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

RPM_NAME = "python39-cryptography-41.0.3-2.1.aarch64.rpm"
RPM_HASH = "5cea1a924d9a7caf702018b166dc2d88c10708e776aad7ee1360b65173a7471be01de062aaa043d1687f761759fc579b9805265904102644b85e49b36b3c5391"

RPROVIDES:${PN} += "python3.9dist-cryptography \
python39-cryptography \
python3dist-cryptography"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
python-abi \
python39 \
python39-cffi"

inherit rpm
