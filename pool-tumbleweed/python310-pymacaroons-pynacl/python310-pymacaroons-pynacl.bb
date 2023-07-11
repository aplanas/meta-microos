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

RPM_NAME = "python310-pymacaroons-pynacl-0.9.3-5.8.noarch.rpm"
RPM_HASH = "36bc595577c650af2ad5eec96545991dd738d06664752183576922c139141550f5feead6ab44755ed7d20accb409be8f32f728a6052cc4b1e6e6854a6dc4dc4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymacaroons-pynacl \
python310-pymacaroons-pynacl \
python3dist-pymacaroons-pynacl"

RDEPENDS:${PN} += "python-abi \
python310-PyNaCl \
python310-cffi \
python310-six"

inherit rpm
