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

RPM_NAME = "python39-cryptography-41.0.1-1.1.aarch64.rpm"
RPM_HASH = "b582ab71f28bae2feef0b9631207695369421399946ebf9e0609ee69fa7954dcf347131fdbe3aa560ed7d1042f0e9099ae0ffdda28cc17c487abf30a7f207563"

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
