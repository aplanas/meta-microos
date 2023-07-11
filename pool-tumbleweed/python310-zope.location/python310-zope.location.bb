SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, location are special objects that has a structural location."
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python310-zope.location-4.3-2.3.noarch.rpm"
RPM_HASH = "911289b8636b0d6ee325b8470d6762fc5c178283436073b2d3f4942880e321fbd86d8e7c363949997277f592fcd0de5cad14626be8f6e2281b2b8b219d112155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.location \
python310-zope.location \
python3dist-zope.location"

RDEPENDS:${PN} += "python-abi \
python310-zope.interface \
python310-zope.proxy \
python310-zope.schema"

inherit rpm
