SUMMARY = "Method and property caching decorators"
DESCRIPTION = "Cached descriptors cache their output.  They take into account \
instance attributes that they depend on, so when the instance \
attributes change, the descriptors will change the values they \
return. \
 \
Cached descriptors cache their data in _v_ attributes, so they are \
also useful for managing the computation of volatile attributes for \
persistent objects."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-zope.cachedescriptors-5.0-1.1.noarch.rpm"
RPM_HASH = "e6061f52990447875cb6663de4eb25bc429dd96c8c90a9721cdd8db70d11fd9d0cc6d79f49ef929a686558eb7d17a6e7edd1903130c15cf02b936bc778859234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.cachedescriptors \
python39-zope.cachedescriptors \
python3dist-zope.cachedescriptors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
