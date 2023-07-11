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

RPM_NAME = "python311-pymacaroons-0.13.0-5.3.noarch.rpm"
RPM_HASH = "6dc8fae611b85727605d32601cdc0f0121b7258be649f25715fc2f23ffdad5367ce466bb0a1f8afaef09d28f94f9bfbb0fc2c41008522f5ba77166563dd3e84e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymacaroons \
python3.11dist-pymacaroons \
python311-pymacaroons \
python3dist-pymacaroons"

RDEPENDS:${PN} += "python-abi \
python311-PyNaCl \
python311-cffi \
python311-six"

inherit rpm
