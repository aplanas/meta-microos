SUMMARY = "A modern CSS selector implementation for BeautifulSoup"
DESCRIPTION = "A modern CSS selector implementation for BeautifulSoup"
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python39-soupsieve-2.4.1-1.1.noarch.rpm"
RPM_HASH = "9d3da9f6242f01f60010b464c42fa42d1e9df096ba1b23ce60a34bfa2f35311e66e9803e7161eb0ba1ad0972c6b201b6e9246d19fad29281674d5ba81bb33668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-soupsieve \
python39-soupsieve \
python3dist-soupsieve"

RDEPENDS:${PN} += "python-abi"

inherit rpm
