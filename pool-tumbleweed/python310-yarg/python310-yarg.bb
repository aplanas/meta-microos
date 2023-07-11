SUMMARY = "A PyPI client"
DESCRIPTION = "A PyPI client."
LICENSE = "MIT"

PV = "0.1.9"

RPM_NAME = "python310-yarg-0.1.9-3.3.noarch.rpm"
RPM_HASH = "f66ac0a80d81e46de1756cea27ffe025d719bf359d3068ed7ae91120d268aaa2b51b0c013e6b61b659d90d4c27d9aa5234950c67b7ec9e6b5159f881826953e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yarg \
python310-yarg \
python3dist-yarg"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
