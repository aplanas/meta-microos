SUMMARY = "The Argon2 password hashing algorithm for Python"
DESCRIPTION = "A Python module that uses CFFI to access the Argon2 password hashing \
C library."
LICENSE = "MIT"

PV = "21.3.0"

RPM_NAME = "python39-argon2-cffi-21.3.0-3.3.aarch64.rpm"
RPM_HASH = "323cba9c53c72ace171d1ba5f6fad67be4c0d48ba48e4882c576a0fb7c4751eec2b726481997deaab11b2ad853b0b1cbbf4c50451c95616e86543496df2f099d"

RPROVIDES:${PN} += "python3.9dist-argon2-cffi \
python39-argon2-cffi \
python3dist-argon2-cffi"

RDEPENDS:${PN} += "python-abi \
python39-argon2-cffi-bindings"

inherit rpm
