SUMMARY = "Unit tests"
DESCRIPTION = "Unit tests for python-azure-agent."
LICENSE = "Apache-2.0"

PV = "2.8.0.11"

RPM_NAME = "python-azure-agent-test-2.8.0.11-3.3.noarch.rpm"
RPM_HASH = "fac6e3f5cc5bc65c3e624f96314e38232c58c6cf2d95dd956b0fa0df296d6271bc5c0bd61832e2a2d052b9587336794d87a08004e71744390aa01ff5efdce853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-azure-agent-test"

RDEPENDS:${PN} += "/usr/bin/env \
openssl \
python(abi) \
python-azure-agent \
python3-pytest"

inherit rpm
