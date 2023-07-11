SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "python310-PyJWT-2.7.0-1.3.noarch.rpm"
RPM_HASH = "08fa62e6afab51895cfdaa826626b762dce33598210bc784a0d02c51a135e9d85d12f9147418d5db41c9462eb46c29e3bbba6117a96c100382e7a9d90d1f4bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyjwt \
python310-PyJWT \
python3dist-pyjwt"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-typing-extensions \
update-alternatives"

inherit rpm
