SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, location are special objects that has a structural location."
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python311-zope.location-4.3-2.3.noarch.rpm"
RPM_HASH = "b9e20169850d85770e92b7906350395df6c3b8a8fa3cd0bbb9ac416a3fedd15c0254bb6f82d9fbc8ee613d8ac9ee6ebfa4eafcf4348a7ccab4b6f299dd8af40c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.location \
python3.11dist-zope.location \
python311-zope.location \
python3dist-zope.location"

RDEPENDS:${PN} += "python-abi \
python311-zope.interface \
python311-zope.proxy \
python311-zope.schema"

inherit rpm
