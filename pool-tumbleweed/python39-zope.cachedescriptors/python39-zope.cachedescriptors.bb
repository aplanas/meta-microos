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

RPM_NAME = "python39-zope.cachedescriptors-5.0-1.2.noarch.rpm"
RPM_HASH = "fc8352313a47c655c5588b7ad9b8f840510dfefeca7b730e5187c0f3ba8785414dc35acb4ce7be19d3da443ccefdf643cd9b89cd9616e48153b02b339f5f0b34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.cachedescriptors \
python39-zope.cachedescriptors \
python3dist-zope.cachedescriptors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
