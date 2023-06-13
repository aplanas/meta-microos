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

RPM_NAME = "python310-pymacaroons-0.13.0-4.6.noarch.rpm"
RPM_HASH = "c68566ea3ffee1f4ce4895fd3294c37f375889d479921a9c50ddd0993272beeaf17b8a03a51f59ff7d4661e4a51c3fd644307a597c001e8f240f7c455d6d5e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymacaroons \
python3.10dist(pymacaroons) \
python310-pymacaroons \
python3dist(pymacaroons)"

RDEPENDS:${PN} += "python(abi) \
python310-PyNaCl \
python310-cffi \
python310-six"

inherit rpm
