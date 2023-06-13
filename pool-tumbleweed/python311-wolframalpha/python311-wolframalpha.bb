SUMMARY = "WolframAlpha 2.0 API client"
DESCRIPTION = "Python Client built against the Wolfram|Alpha (http://wolframalpha.com) \
v2.0 API."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python311-wolframalpha-5.0.0-2.3.noarch.rpm"
RPM_HASH = "e2717d4562eb8093bcfc73559788ed7fd56a8a1bb962d296a8a2b5c443d9ad78afe71ca9a2d5e102d434cb9ad5eef4a4d3a0bfa55c678018accae166e111100e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wolframalpha) \
python311-wolframalpha \
python3dist(wolframalpha)"

RDEPENDS:${PN} += "python(abi) \
python311-jaraco.context \
python311-more-itertools \
python311-xmltodict"

inherit rpm
