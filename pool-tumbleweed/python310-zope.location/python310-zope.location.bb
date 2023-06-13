SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, location are special objects that has a structural location."
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python310-zope.location-4.3-1.3.noarch.rpm"
RPM_HASH = "5586075c62dd6d2b71ffab32b5b66bc39b17984db411054a01f8408edca4d82113b84630d3c916866cf6d3660411af58540e0ac1b6b259f91b802357be5a62f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.location \
python3.10dist(zope.location) \
python310-zope.location \
python3dist(zope.location)"

RDEPENDS:${PN} += "python(abi) \
python310-zope.interface \
python310-zope.proxy \
python310-zope.schema"

inherit rpm
