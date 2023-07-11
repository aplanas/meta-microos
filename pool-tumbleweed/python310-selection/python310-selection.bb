SUMMARY = "API to extract content from HTML & XML documents"
DESCRIPTION = "API to extract content from HTML & XML documents"
LICENSE = "MIT"

PV = "0.0.21"

RPM_NAME = "python310-selection-0.0.21-1.3.noarch.rpm"
RPM_HASH = "1930a8399647be13e6b2e9644115a6b3f7d063614c871138a88ee054084893e92b3c884a47a9d735696fbb2e57e3a18e543e3d1517db33e634b720f3f5e106d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-selection \
python310-selection \
python3dist-selection"

RDEPENDS:${PN} += "python-abi \
python310-lxml"

inherit rpm
