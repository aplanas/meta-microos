SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
DESCRIPTION = "PyNaCl is a Python binding to the `Networking and Cryptography library`_, \
a crypto library with the stated goal of improving usability, security and \
speed."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python311-PyNaCl-1.5.0-4.1.aarch64.rpm"
RPM_HASH = "c1e720a60e85f88fa9692f6198ac54e314a5af9c5d00359af75eac4ef7a5651878b7d63a3871af79773c391c50037fd15ee43966a3168a26796a01bb424bee39"

RPROVIDES:${PN} += "python3-PyNaCl \
python3.11dist-pynacl \
python311-PyNaCl \
python3dist-pynacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.23 \
python-abi \
python311-cffi"

inherit rpm
