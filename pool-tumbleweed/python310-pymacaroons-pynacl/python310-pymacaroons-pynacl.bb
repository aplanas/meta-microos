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

RPM_NAME = "python310-pymacaroons-pynacl-0.9.3-5.6.noarch.rpm"
RPM_HASH = "a9e4285e598212022e2c531957747aaf2c9a75bff0b7ffb9c99b54e4dce4f46647c58bd846c9790e37f473813c77035d929646f982574f69fde9f22f45b61b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymacaroons-pynacl \
python3.10dist-pymacaroons-pynacl \
python310-pymacaroons-pynacl \
python3dist-pymacaroons-pynacl"

RDEPENDS:${PN} += "python-abi \
python310-PyNaCl \
python310-cffi \
python310-six"

inherit rpm
