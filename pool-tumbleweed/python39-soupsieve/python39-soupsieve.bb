SUMMARY = "A modern CSS selector implementation for BeautifulSoup"
DESCRIPTION = "A modern CSS selector implementation for BeautifulSoup"
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python39-soupsieve-2.4.1-1.3.noarch.rpm"
RPM_HASH = "55f9f3f42ed57fc1554ced956ec64ea43b8793defb217f7e37e398fe12cd7de2687361e6b46a1cb7c3dcab43d237bb805fc3e23e421f10b286b459df637e31ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-soupsieve \
python39-soupsieve \
python3dist-soupsieve"

RDEPENDS:${PN} += "python-abi"

inherit rpm
