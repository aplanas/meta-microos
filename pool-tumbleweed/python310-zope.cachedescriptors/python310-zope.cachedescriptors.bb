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

RPM_NAME = "python310-zope.cachedescriptors-5.0-1.1.noarch.rpm"
RPM_HASH = "ceea30cfe9f8dbbb33b32a3a27b53da74c842f0bcb99149af8efec5328303eabc69cfe122ee1e4b41bb25218b1720777e467121291ef8b6bdd83e0a8cecae6e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.cachedescriptors \
python3.10dist(zope.cachedescriptors) \
python310-zope.cachedescriptors \
python3dist(zope.cachedescriptors)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
