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

RPM_NAME = "python310-pymacaroons-0.13.0-5.3.noarch.rpm"
RPM_HASH = "41f3581815c2d914bbfa77940e30bacf79889f4965ebee9dd33e44e55e408e640406d295995bc2f9ac5ec1d143c117fc6d63404e6ead5bf2a589d3d39b9b6bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymacaroons \
python310-pymacaroons \
python3dist-pymacaroons"

RDEPENDS:${PN} += "python-abi \
python310-PyNaCl \
python310-cffi \
python310-six"

inherit rpm
