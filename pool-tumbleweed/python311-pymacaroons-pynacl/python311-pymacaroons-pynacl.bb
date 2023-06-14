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

RPM_NAME = "python311-pymacaroons-pynacl-0.9.3-5.6.noarch.rpm"
RPM_HASH = "7f127cf70313ea7c24b72e0bf93646085205ffb1470bb84f20977f7ce1afe69d0c6cf4c0702c4cda29988f36e397e18da979a68da5b54abc4a8d178426c225cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pymacaroons-pynacl \
python311-pymacaroons-pynacl \
python3dist-pymacaroons-pynacl"

RDEPENDS:${PN} += "python-abi \
python311-PyNaCl \
python311-cffi \
python311-six"

inherit rpm
