SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
DESCRIPTION = "PyNaCl is a Python binding to the `Networking and Cryptography library`_, \
a crypto library with the stated goal of improving usability, security and \
speed."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python310-PyNaCl-1.5.0-3.3.aarch64.rpm"
RPM_HASH = "5a91d23f23bafdaf5056a8be5fc6ae9e92044b762224c72cbf016b56cf04f6867b3c6e383b90198bc4d6065efb9ce4c815cfe7433d7f805ce5bd70ecca624634"

RPROVIDES:${PN} += "python3.10dist-pynacl \
python310-PyNaCl \
python3dist-pynacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.23 \
python-abi \
python310-cffi"

inherit rpm
