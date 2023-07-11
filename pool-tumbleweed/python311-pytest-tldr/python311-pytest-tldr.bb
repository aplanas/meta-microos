SUMMARY = "A pytest plugin that limits the output to just the things you need"
DESCRIPTION = "A pytest plugin that limits the output to just the things you need."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "python311-pytest-tldr-0.2.5-1.5.noarch.rpm"
RPM_HASH = "52a57430ccf5a90e4f8c7fe7b17b487db49159c2b74d124825b86d1bb795624d220e0998662f3aab674e09f2138f76ef87609f6556aff50b9315edcbea665286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-tldr \
python3.11dist-pytest-tldr \
python311-pytest-tldr \
python3dist-pytest-tldr"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
