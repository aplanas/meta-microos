SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "python311-PyJWT-2.7.0-1.1.noarch.rpm"
RPM_HASH = "3a449b9b5ca18e9e8f08f66f18c848aa0d61703d7a595fad1b6f2a666081252c23729ae2303ef70e1094ef0d1991afda92db3185762a8fb608ab9439b0fa884e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyjwt \
python311-PyJWT \
python3dist-pyjwt"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-typing-extensions \
update-alternatives"

inherit rpm
