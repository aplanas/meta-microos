SUMMARY = "A VCR imitation for python-requests"
DESCRIPTION = "Betamax is a VCR_ imitation for requests. This will make mocking out requests \
much easier."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python39-betamax-0.8.1-2.2.noarch.rpm"
RPM_HASH = "f30e2b487495d0b2ff084270e2fa1552da83d4a2286f7dbe2577d471659bc8e16c5159712f1bc29001e2c4eb6787ad6de5e1da11734bba7e1e60cb22924efa46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-betamax \
python39-betamax \
python3dist-betamax"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
