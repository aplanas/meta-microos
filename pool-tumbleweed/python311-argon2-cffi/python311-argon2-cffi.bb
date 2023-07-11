SUMMARY = "The Argon2 password hashing algorithm for Python"
DESCRIPTION = "A Python module that uses CFFI to access the Argon2 password hashing \
C library."
LICENSE = "MIT"

PV = "21.3.0"

RPM_NAME = "python311-argon2-cffi-21.3.0-3.3.aarch64.rpm"
RPM_HASH = "e472fd61dfe63a896998fd80fc34dbc297e7dc36bfa5f70cb4a6d82eb504aa38fff611c079ba8ee5fd7bb8367a4fafc2753cd3318b278f04405f341aa3ff9e52"

RPROVIDES:${PN} += "python3-argon2-cffi \
python3.11dist-argon2-cffi \
python311-argon2-cffi \
python3dist-argon2-cffi"

RDEPENDS:${PN} += "python-abi \
python311-argon2-cffi-bindings"

inherit rpm
