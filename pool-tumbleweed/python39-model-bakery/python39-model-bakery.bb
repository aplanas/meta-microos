SUMMARY = "Smart object creation facility for Django"
DESCRIPTION = "Smart object creation facility for Django."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "python39-model-bakery-1.9.0-1.5.noarch.rpm"
RPM_HASH = "98ad1b086862a444deffe157694655d000ffc7f18cd20eb5f511c65aa01b3f57491d26122dbfae7710f62036fcfed6ab780aad4159816bda49f33ffa92b511bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-model-bakery \
python39-model-bakery \
python3dist-model-bakery"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
