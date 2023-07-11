SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
DESCRIPTION = "PyNaCl is a Python binding to the `Networking and Cryptography library`_, \
a crypto library with the stated goal of improving usability, security and \
speed."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python311-PyNaCl-1.5.0-3.3.aarch64.rpm"
RPM_HASH = "dd4f4306badb931b86f26c9ed2c1321f02bc6ae587e75df97b662a386d316313ed7425325c73ca3c1271752e5e5fac1ee8212958bcc014719f4cea6a796c09fe"

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
