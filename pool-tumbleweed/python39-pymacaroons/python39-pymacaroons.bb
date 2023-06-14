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

RPM_NAME = "python39-pymacaroons-0.13.0-4.6.noarch.rpm"
RPM_HASH = "0050ed5d18689fc0d70bd59d7b96c973088b50882cd1c159da1d22f0f7dcfcbeb12177903008f09360a64af419ad224c27c2d647d8e84bd8707c055d2510adc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymacaroons \
python39-pymacaroons \
python3dist-pymacaroons"

RDEPENDS:${PN} += "python-abi \
python39-PyNaCl \
python39-cffi \
python39-six"

inherit rpm
