SUMMARY = "A VCR imitation for python-requests"
DESCRIPTION = "Betamax is a VCR_ imitation for requests. This will make mocking out requests \
much easier."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python310-betamax-0.8.1-2.2.noarch.rpm"
RPM_HASH = "1bfcd5d5a08360a9aa65cd1459e2a0cae1ccb2c08b436cb97f3a4a637da9da4be16fbf988f8046a1a533e5d6503febcaec409acd4a32c03b0ffd22a9f29f4b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-betamax \
python310-betamax \
python3dist-betamax"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
