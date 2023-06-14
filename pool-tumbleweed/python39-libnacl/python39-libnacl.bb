SUMMARY = "Python bindings for libsodium based on ctypes"
DESCRIPTION = "This library is used to gain direct access to the functions exposed by Daniel J. Bernstein's nacl library via libsodium. \
It has been constructed to maintain extensive documentation on how to use nacl as well as being completely portable. The file \
in libnacl/__init__.py can be pulled out and placed directly in any project to give a single file binding to all of nacl."
LICENSE = "Apache-2.0"

PV = "1.7.2"

RPM_NAME = "python39-libnacl-1.7.2-2.8.aarch64.rpm"
RPM_HASH = "e218f0f3d4e5dfe862721c94c90b4c755a9157dcee0c0181045a70807c20521f699a565e4f71c6282eddcf0336753dd9e7a20933102810321780cebe4103dda9"

RPROVIDES:${PN} += "python3.9dist-libnacl \
python39-libnacl \
python3dist-libnacl"

RDEPENDS:${PN} += "libsodium23 \
python-abi"

inherit rpm
