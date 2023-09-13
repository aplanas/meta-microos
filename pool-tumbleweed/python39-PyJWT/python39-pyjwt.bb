SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python39-PyJWT-2.8.0-1.1.noarch.rpm"
RPM_HASH = "0355a2c922d001cc85751a982402df046a8d2f3d148f76bc08dffb142b48feef9a55f603b89a3a64d2bc113a0f47394485f334ed30219b741df2cff6e70ace45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyjwt \
python39-PyJWT \
python3dist-pyjwt"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-typing-extensions \
update-alternatives"

inherit rpm
