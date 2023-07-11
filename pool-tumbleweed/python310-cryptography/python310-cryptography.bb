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

PV = "41.0.1"

RPM_NAME = "python310-cryptography-41.0.1-1.1.aarch64.rpm"
RPM_HASH = "c6d9107d4b01df7d302fdc1869473a376190b76993e0c1eb1a2056e89e06f85516b807e2e4e1795cadcf636977c4f2051992cceeddf432ab7d49d956084fab3d"

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
