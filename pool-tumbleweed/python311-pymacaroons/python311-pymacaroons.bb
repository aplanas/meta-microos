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

RPM_NAME = "python311-pymacaroons-0.13.0-4.6.noarch.rpm"
RPM_HASH = "5c8e393f8d21c2a60cf2f19717ec995e10847177c131ae6c70ba839a10305b2b4f6dbd6ec7656bbf7d453a773b3a6d2dcb08c5f59a5c76e0bd533fd3c5879f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pymacaroons \
python311-pymacaroons \
python3dist-pymacaroons"

RDEPENDS:${PN} += "python-abi \
python311-PyNaCl \
python311-cffi \
python311-six"

inherit rpm
