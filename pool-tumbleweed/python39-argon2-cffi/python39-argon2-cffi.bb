SUMMARY = "The Argon2 password hashing algorithm for Python"
DESCRIPTION = "A Python module that uses CFFI to access the Argon2 password hashing \
C library."
LICENSE = "MIT"

PV = "21.3.0"

RPM_NAME = "python39-argon2-cffi-21.3.0-2.2.aarch64.rpm"
RPM_HASH = "0ea10741e5154829ef0f7b65061f2d37437dc258d91e772fe107f9f422cb68e8a8649d5755735d96081d9e68a9aa25728a06776f9f42417c5bc3411c1f74d626"

RPROVIDES:${PN} += "python3.9dist(argon2-cffi) \
python39-argon2-cffi \
python39-argon2-cffi(aarch-64) \
python39-argon2_cffi \
python3dist(argon2-cffi)"
RDEPENDS:${PN} += "python(abi) \
python39-argon2-cffi-bindings"

inherit rpm
