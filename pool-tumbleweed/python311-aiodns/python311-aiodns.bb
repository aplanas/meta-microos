SUMMARY = "Simple DNS resolver for asyncio"
DESCRIPTION = "Simple DNS resolver for asyncio module."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-aiodns-3.0.0-2.1.noarch.rpm"
RPM_HASH = "b76b7630bde525cc7c8601a9108e9235c683f92ae68e5f8d880e8c54b90aed7b378966b63e96431f59fc7da89cf71869d21052630ee58720ff289da2d5f3d7c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aiodns) \
python311-aiodns \
python3dist(aiodns)"

RDEPENDS:${PN} += "python(abi) \
python311-pycares"

inherit rpm
