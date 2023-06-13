SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, location are special objects that has a structural location."
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python311-zope.location-4.3-1.3.noarch.rpm"
RPM_HASH = "695fbcc81d017f44c360455813116d10be982d33915c72b0208bbb7bb1db67f2ea59d5ab0bc23fd67b6753990b620de3fe8785bc7372c6e738e8b961dc974a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zope.location) \
python311-zope.location \
python3dist(zope.location)"

RDEPENDS:${PN} += "python(abi) \
python311-zope.interface \
python311-zope.proxy \
python311-zope.schema"

inherit rpm
