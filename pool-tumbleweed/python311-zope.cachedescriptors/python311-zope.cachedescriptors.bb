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

RPM_NAME = "python311-zope.cachedescriptors-5.0-1.2.noarch.rpm"
RPM_HASH = "147f77221301d6f6527ee1feac6e7ba58eba5c87208d868876b26804b452193f810a63128ca5248c191397e850399c124b66887b93409fc80044756c32158a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.cachedescriptors \
python3.11dist-zope.cachedescriptors \
python311-zope.cachedescriptors \
python3dist-zope.cachedescriptors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
