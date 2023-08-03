SUMMARY = "Zope DateTime data type"
DESCRIPTION = "This package provides a DateTime data type, as known from Zope. \
Unless you need to communicate with Zope APIs, you're probably \
better off using Python's built-in datetime module."
LICENSE = "ZPL-2.1"

PV = "5.2"

RPM_NAME = "python311-DateTime-5.2-1.1.noarch.rpm"
RPM_HASH = "4bd7b064a52fb01498cf0a3e16dfd89a748a4551f34ef8c1d977115fc15f9adf44dddde4ec8683666502487bdfbbfe561370dee7b7d5246ea2343169ec499434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-DateTime \
python3.11dist-datetime \
python311-DateTime \
python3dist-datetime"

RDEPENDS:${PN} += "python-abi \
python311-pytz \
python311-zope.interface"

inherit rpm
