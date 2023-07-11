SUMMARY = "The Argon2 password hashing algorithm for Python"
DESCRIPTION = "A Python module that uses CFFI to access the Argon2 password hashing \
C library."
LICENSE = "MIT"

PV = "21.3.0"

RPM_NAME = "python310-argon2-cffi-21.3.0-3.3.aarch64.rpm"
RPM_HASH = "1ed07e89add4066a364b6008b2fce6b25dec0b929434790e5376007ed64d7db5fc4a4b4c638175b7329e9748f3a0608316efa8ed952a4ed896ed6295ec739a26"

RPROVIDES:${PN} += "python3.10dist-argon2-cffi \
python310-argon2-cffi \
python3dist-argon2-cffi"

RDEPENDS:${PN} += "python-abi \
python310-argon2-cffi-bindings"

inherit rpm
