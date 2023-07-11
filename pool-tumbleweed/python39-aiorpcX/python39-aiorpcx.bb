SUMMARY = "Generic async RPC implementation, including JSON-RPC"
DESCRIPTION = "Generic async RPC implementation, including JSON-RPC"
LICENSE = "MIT"

PV = "0.22.1"

RPM_NAME = "python39-aiorpcX-0.22.1-1.7.noarch.rpm"
RPM_HASH = "70f3d20f91352315f63701e96d5308abe4e8b083777296d33cf964493a93cf58772ee6399af7f9b8ecef582431872e22423662333be0b22e3a33bd81e31864f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiorpcx \
python39-aiorpcX \
python3dist-aiorpcx"

RDEPENDS:${PN} += "python-abi \
python39-attrs"

inherit rpm
