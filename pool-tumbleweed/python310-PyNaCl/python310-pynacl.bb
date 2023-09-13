SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
DESCRIPTION = "PyNaCl is a Python binding to the `Networking and Cryptography library`_, \
a crypto library with the stated goal of improving usability, security and \
speed."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python310-PyNaCl-1.5.0-4.1.aarch64.rpm"
RPM_HASH = "8cdffa59c8b1633ec5f730f81685400bf3c9a243d1b88e0644324867fec4b3af509f2cea3d21eabad3ac8eccc13ec4904036970b7a8c6f99cb5e4515955a2097"

RPROVIDES:${PN} += "python3.10dist-pynacl \
python310-PyNaCl \
python3dist-pynacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.23 \
python-abi \
python310-cffi"

inherit rpm
