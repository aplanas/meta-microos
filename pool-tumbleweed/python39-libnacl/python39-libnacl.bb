SUMMARY = "Python bindings for libsodium based on ctypes"
DESCRIPTION = "This library is used to gain direct access to the functions exposed by Daniel J. Bernstein's nacl library via libsodium. \
It has been constructed to maintain extensive documentation on how to use nacl as well as being completely portable. The file \
in libnacl/__init__.py can be pulled out and placed directly in any project to give a single file binding to all of nacl."
LICENSE = "Apache-2.0"

PV = "1.7.2"

RPM_NAME = "python39-libnacl-1.7.2-3.1.aarch64.rpm"
RPM_HASH = "56b4b69679882079f4afd881ceac857950df590886790635c09e5a1295f74201e7316c0bb4005421589e416c3d7cad965605e57b1ad15b7e954efe47badd4dc3"

RPROVIDES:${PN} += "python3.9dist-libnacl \
python39-libnacl \
python3dist-libnacl"

RDEPENDS:${PN} += "libsodium23 \
python-abi"

inherit rpm
