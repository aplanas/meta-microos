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

RPM_NAME = "python311-cryptography-41.0.3-1.1.aarch64.rpm"
RPM_HASH = "45596e31bbf05f41786c9933205c5bb9892d8885580ee505b2dd4658c603492beb44b6561f37a3618ba742be6e0ae16e9c0e0a32eb03716b0819d9f033500eec"

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
