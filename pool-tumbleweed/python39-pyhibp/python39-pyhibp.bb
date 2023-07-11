SUMMARY = "An interface to Troy Hunt's 'Have I Been Pwned' public API"
DESCRIPTION = "A Python interface to Troy Hunt's 'Have I Been Pwned?' (HIBP) public API."
LICENSE = "AGPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "python39-pyhibp-4.2.0-1.5.noarch.rpm"
RPM_HASH = "a6e2c877340c3fbc09d38fc8e7976c753457e6bdd2e9ad0a54a70405f04252215f73769fd9a90db79f4a5260c0e12bc753757111bb587119617484c8e71cfd95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyhibp \
python39-pyhibp \
python3dist-pyhibp"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
