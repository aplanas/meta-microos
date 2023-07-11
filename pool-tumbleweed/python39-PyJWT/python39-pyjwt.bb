SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "python39-PyJWT-2.7.0-1.3.noarch.rpm"
RPM_HASH = "1477b0a8df4fe7cdd4c4d916a35fc7cdde5ae09ec05158f0e38e68edb5378870ceeb3e497f4680fefccc38e4cc2b336b6a29ff948d40c564e3989c0a6e566902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyjwt \
python39-PyJWT \
python3dist-pyjwt"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-typing-extensions \
update-alternatives"

inherit rpm
