SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python311-PyJWT-2.8.0-1.1.noarch.rpm"
RPM_HASH = "e9a4742b3a6141f2ccf5cd96933ef3eea5495100fa82950018d8345d36802c22b92b049b69e3699de88801021b2fec3b498abd34281173b6989672d3ab667394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyJWT \
python3.11dist-pyjwt \
python311-PyJWT \
python3dist-pyjwt"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-typing-extensions \
update-alternatives"

inherit rpm
