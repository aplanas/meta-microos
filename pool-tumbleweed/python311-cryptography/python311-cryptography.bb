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

RPM_NAME = "python311-cryptography-41.0.2-2.1.aarch64.rpm"
RPM_HASH = "96a5624660bceb8460a79f181900c004b2f3e13c70db5f7742f3a31af9a651e01af1b79c9edaace457a5d2bcba91e5ef2795fd6460c7f241ca11a93cb035b9df"

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
