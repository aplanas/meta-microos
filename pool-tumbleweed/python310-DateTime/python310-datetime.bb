SUMMARY = "Zope DateTime data type"
DESCRIPTION = "This package provides a DateTime data type, as known from Zope. \
Unless you need to communicate with Zope APIs, you're probably \
better off using Python's built-in datetime module."
LICENSE = "ZPL-2.1"

PV = "5.1"

RPM_NAME = "python310-DateTime-5.1-1.3.noarch.rpm"
RPM_HASH = "37be5bbf73530d2468733cee822a9cadab958eaad2622841fa45d17887cb0fe335eb8bbaea5c2658f5fa886cfa9b50c0da738be193c9ac4a2d097167d2d2b282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-datetime \
python310-DateTime \
python3dist-datetime"

RDEPENDS:${PN} += "python-abi \
python310-pytz \
python310-zope.interface"

inherit rpm
