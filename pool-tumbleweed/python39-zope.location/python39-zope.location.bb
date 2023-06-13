SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, location are special objects that has a structural location."
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python39-zope.location-4.3-1.3.noarch.rpm"
RPM_HASH = "79c5b71e09da45f14660fdc67f056fb1cccd5be155695cabc60ec2f501d01c8244d0d5c5f6cf2824fb513a01d9b5a634d22e8c542e1ad58e064a15e3aa086233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zope.location) \
python39-zope.location \
python3dist(zope.location)"

RDEPENDS:${PN} += "python(abi) \
python39-zope.interface \
python39-zope.proxy \
python39-zope.schema"

inherit rpm
