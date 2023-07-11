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

RPM_NAME = "python39-pymacaroons-pynacl-0.9.3-5.8.noarch.rpm"
RPM_HASH = "cae909b6c1cbbd6e2a9043ec2e9a14b58d0fb38f7f30f7cf4811be37a286f2454c85ed14ecf27192ea5dd4699d018d2208a1ac72a499f1e81528e2afd0f91913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymacaroons-pynacl \
python39-pymacaroons-pynacl \
python3dist-pymacaroons-pynacl"

RDEPENDS:${PN} += "python-abi \
python39-PyNaCl \
python39-cffi \
python39-six"

inherit rpm
