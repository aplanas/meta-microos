SUMMARY = "Macaroon library for Python"
DESCRIPTION = "Macaroons, like cookies, are a form of bearer credential. \
Unlike opaque tokens, macaroons embed caveats that define \
specific authorization requirements for the target service, \
the service that issued the root macaroon and which is \
capable of verifying the integrity of macaroons it recieves. \
 \
Macaroons allow for delegation and attenuation of authorization. \
They are simple and fast to verify, and decouple authorization policy \
from the enforcement of that policy. \
 \
This is a Python implementation of Macaroons."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python311-pymacaroons-pynacl-0.9.3-5.8.noarch.rpm"
RPM_HASH = "1700b9ec180b19e8e69a278b3d9b378a33eeb620dd553cfbe5530bc8a63f46abc3ff8295f29cb34a9bdfacdead4d6359515eb697f45a5b447e7455acfc7d286c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymacaroons-pynacl \
python3.11dist-pymacaroons-pynacl \
python311-pymacaroons-pynacl \
python3dist-pymacaroons-pynacl"

RDEPENDS:${PN} += "python-abi \
python311-PyNaCl \
python311-cffi \
python311-six"

inherit rpm
