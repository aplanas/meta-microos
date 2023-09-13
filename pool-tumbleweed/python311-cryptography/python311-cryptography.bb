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

RPM_NAME = "python311-cryptography-41.0.3-2.1.aarch64.rpm"
RPM_HASH = "64cf3cf72f8a43265d6f971d3adb2638e7edf0badc8fbc9366f8ff9bd19887c8d8ebc6e71b97119ba02e7bd729762a71ae5040cc451970eb9c61ea2da869cff3"

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
