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

RPM_NAME = "python310-cryptography-41.0.2-1.1.aarch64.rpm"
RPM_HASH = "31a135fff34b142a4f31bef6b33d260e236862b7b5c3f9d42c7b331657971bf1db4445bd77a4ee6084621f0a4e2244ae440602c7af16c442296d805159382b3e"

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
