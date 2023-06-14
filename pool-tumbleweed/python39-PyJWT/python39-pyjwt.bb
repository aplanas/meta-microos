SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "python39-PyJWT-2.7.0-1.1.noarch.rpm"
RPM_HASH = "334094a4a69cbee17ee8c39965e26533023c8049778d1f06e020fb962182123d4b4f7c521ee68602309722195282eac2771d536ca1619d5a136cda66c2fdf9b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyjwt \
python39-PyJWT \
python3dist-pyjwt"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-typing-extensions \
update-alternatives"

inherit rpm
