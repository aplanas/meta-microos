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

RPM_NAME = "python310-cryptography-41.0.2-2.1.aarch64.rpm"
RPM_HASH = "c8aa3fb3328ab8e4677e7f1d644cec72acf7ac890ee56c9545496836af1bd6e9e0ab6b1f56aa8720a0f9e23dee7882438c5db0eb26002db4f9487b3973edf80b"

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
