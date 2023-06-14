SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
DESCRIPTION = "PyNaCl is a Python binding to the `Networking and Cryptography library`_, \
a crypto library with the stated goal of improving usability, security and \
speed."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python39-PyNaCl-1.5.0-3.1.aarch64.rpm"
RPM_HASH = "3531b0a89193bc76d7058066b5ee2a8c1324bd7f28cd4b1bd66398611a808129ebb0c29f410b18861062c4ad8496316f58e0389589c897cc41b01ded003dcdd5"

RPROVIDES:${PN} += "python3.9dist-pynacl \
python39-PyNaCl \
python3dist-pynacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.23 \
python-abi \
python39-cffi"

inherit rpm
