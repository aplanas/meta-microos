SUMMARY = "A VCR imitation for python-requests"
DESCRIPTION = "Betamax is a VCR_ imitation for requests. This will make mocking out requests \
much easier."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python310-betamax-0.8.1-2.1.noarch.rpm"
RPM_HASH = "964d919a21eacb5bc69d0a5d04d8f8455038e1ecb2e8bbf4366d5cedfd7bc0bd5ac2d5e2f18bada9041a40a9e662f79af10a1fbb7ca644428e8b36aca9b19ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-betamax \
python3.10dist(betamax) \
python310-betamax \
python3dist(betamax)"

RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
