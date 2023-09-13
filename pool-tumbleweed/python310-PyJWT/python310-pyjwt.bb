SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python310-PyJWT-2.8.0-1.1.noarch.rpm"
RPM_HASH = "60cfcb0714ceb57d1107ff874e9afac797bad3eb25108e78b71c2069de63b5d82fcda7de47bffa8ab8f8e680e10dcdc7b172504eeb2508fc5575c45b82c2b468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyjwt \
python310-PyJWT \
python3dist-pyjwt"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-typing-extensions \
update-alternatives"

inherit rpm
