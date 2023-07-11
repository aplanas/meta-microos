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

RPM_NAME = "python311-cryptography-41.0.1-1.1.aarch64.rpm"
RPM_HASH = "cb04173cb2f7cfe3d718187b11b8ded8dd98058b55784c2dac84f9aaba8133b9c582d6628e68e044db813c01246ace27c74a38a85510f7a711f5889c2088c039"

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
