SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
DESCRIPTION = "PyNaCl is a Python binding to the `Networking and Cryptography library`_, \
a crypto library with the stated goal of improving usability, security and \
speed."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python39-PyNaCl-1.5.0-3.3.aarch64.rpm"
RPM_HASH = "5eac8e06f60f759c9ccfd516e7685af0c70d583532850b7778b35b114a3360dd26651079e68a7a7f8e45efd21d57ce937fe8b0ecd4478bdab5d5bebdedbda89c"

RPROVIDES:${PN} += "python3.9dist-pynacl \
python39-PyNaCl \
python3dist-pynacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.23 \
python-abi \
python39-cffi"

inherit rpm
