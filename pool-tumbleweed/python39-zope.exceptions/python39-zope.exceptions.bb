SUMMARY = "Zope Exceptions"
DESCRIPTION = "This package contains exception interfaces and implementations which are so \
general purpose that they don't belong in Zope application-specific packages."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python39-zope.exceptions-4.6-2.2.noarch.rpm"
RPM_HASH = "365e3d00a9ba9bbafdd7b2ba697b2ccfef0395cf97184bfe4f86d28412270d4884f38d1e347e712fb4d3bee7c1ce37c75cb5b342a1ddc11fbcd1ccb0e22174a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.exceptions \
python39-zope.exceptions \
python3dist-zope.exceptions"

RDEPENDS:${PN} += "python-abi \
python39-zope.interface"

inherit rpm
