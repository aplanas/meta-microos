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

PV = "0.13.0"

RPM_NAME = "python39-pymacaroons-0.13.0-5.3.noarch.rpm"
RPM_HASH = "7ed324d9e5abb4980040437142bec76a1ec87b768fa0e8c11cec4ce02a04f9c45e11af3a5d1a4ec623d29397b9c09a4a13b7927f2ac2657d31de367acc2f7111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymacaroons \
python39-pymacaroons \
python3dist-pymacaroons"

RDEPENDS:${PN} += "python-abi \
python39-PyNaCl \
python39-cffi \
python39-six"

inherit rpm
