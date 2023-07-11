SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, location are special objects that has a structural location."
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python39-zope.location-4.3-2.3.noarch.rpm"
RPM_HASH = "667e28b04f58fe35799c1faf85a5c9a0088e756792e0e9c56934a4fdc3db7042d89d2775c0375fef338ae96cae2017d71beab5a340fca0733cbcdda6c55fd5a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.location \
python39-zope.location \
python3dist-zope.location"

RDEPENDS:${PN} += "python-abi \
python39-zope.interface \
python39-zope.proxy \
python39-zope.schema"

inherit rpm
