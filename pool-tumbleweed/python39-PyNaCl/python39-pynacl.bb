SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
DESCRIPTION = "PyNaCl is a Python binding to the `Networking and Cryptography library`_, \
a crypto library with the stated goal of improving usability, security and \
speed."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python39-PyNaCl-1.5.0-4.1.aarch64.rpm"
RPM_HASH = "222f5e99db23984cdacbeb702ce225f6f8972637118b549277759e14aa8f78ee0fab3f2cfd9e38b867a428048c368f6ae03adcb26e291c5e3e3558f1ff56143c"

RPROVIDES:${PN} += "python3.9dist-pynacl \
python39-PyNaCl \
python3dist-pynacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.23 \
python-abi \
python39-cffi"

inherit rpm
