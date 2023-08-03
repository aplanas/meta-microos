SUMMARY = "Zope DateTime data type"
DESCRIPTION = "This package provides a DateTime data type, as known from Zope. \
Unless you need to communicate with Zope APIs, you're probably \
better off using Python's built-in datetime module."
LICENSE = "ZPL-2.1"

PV = "5.2"

RPM_NAME = "python310-DateTime-5.2-1.1.noarch.rpm"
RPM_HASH = "444e3ea36cf7d7a404562ca80359ed294a2c9625a3d2637bd430df0b8ca95c63b782f2a398d5aa1e4f6aab0754b8b5d11ab66b9ab7ad90a5e95f047a6d28ac41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-datetime \
python310-DateTime \
python3dist-datetime"

RDEPENDS:${PN} += "python-abi \
python310-pytz \
python310-zope.interface"

inherit rpm
