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

RPM_NAME = "python310-zope.cachedescriptors-5.0-1.2.noarch.rpm"
RPM_HASH = "b7c7add068da2faba6e308dccab1a54011d8a53b281c2f51933fbf1840139cebb444fc29f830d2e4e5bf97e8e79f443fbc4c07459c12b2678fc5d025358b78ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.cachedescriptors \
python310-zope.cachedescriptors \
python3dist-zope.cachedescriptors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
