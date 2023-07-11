SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "python311-PyJWT-2.7.0-1.3.noarch.rpm"
RPM_HASH = "3d706359faa01e60395ada39f184800f6bcc104ea4eff47e6dd4b1056b06cd4dc79649d22efb57b078968f00828bc8f852ca49ed644fea378f093664be707406"
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
