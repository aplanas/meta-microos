SUMMARY = "Unit tests"
DESCRIPTION = "Unit tests for python-azure-agent."
LICENSE = "Apache-2.0"

PV = "2.8.0.11"

RPM_NAME = "python-azure-agent-test-2.8.0.11-3.5.noarch.rpm"
RPM_HASH = "39625511e70c2943699e78431e3c4f63a50b36b7ebfb80bef6155b92e900b2f2e98b85fbdb8e18563d62c1219665a120f92c7ecb2478c18d35c42a2d0d43a21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-azure-agent-test"

RDEPENDS:${PN} += "/usr/bin/env \
openssl \
python-abi \
python-azure-agent \
python3-pytest"

inherit rpm
