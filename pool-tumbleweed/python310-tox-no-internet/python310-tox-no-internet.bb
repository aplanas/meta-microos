SUMMARY = "Tox plugin to workaround no internet connection"
DESCRIPTION = "Workarounds for using tox with no internet connection."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python310-tox-no-internet-0.1.0-1.15.noarch.rpm"
RPM_HASH = "2e06d87fc4dfed52014daae0ee0e8994e3f41390c100a6acc615473a9efbd71bd73e60144811ab0a62b7d0d34f6aa65dfa5252f8feb11c9131c665c48bbdef50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tox-no-internet \
python310-tox-no-internet \
python3dist-tox-no-internet"

RDEPENDS:${PN} += "python-abi \
python310-tox"

inherit rpm
