SUMMARY = "Send responses to httpx"
DESCRIPTION = "Send responses to httpx."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python39-pytest-httpx-0.22.0-2.1.noarch.rpm"
RPM_HASH = "9e492f1a8c922ec31165395e01b5bff2974d480557f6301f9048d9643bfdbbd1e511443c18924bd767859beb62ae8006d180c0ccc7c31798b1e82618a15bc9c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-httpx \
python39-pytest-httpx \
python3dist-pytest-httpx"

RDEPENDS:${PN} += "python-abi \
python39-httpx \
python39-pytest"

inherit rpm
