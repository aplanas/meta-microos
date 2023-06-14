SUMMARY = "Zope DateTime data type"
DESCRIPTION = "This package provides a DateTime data type, as known from Zope. \
Unless you need to communicate with Zope APIs, you're probably \
better off using Python's built-in datetime module."
LICENSE = "ZPL-2.1"

PV = "5.1"

RPM_NAME = "python311-DateTime-5.1-1.1.noarch.rpm"
RPM_HASH = "ccd58c9b3aca8489b99df3a71949eb185eeb8f2e973ef72779551f96fe1b7128a2631508b53ae548071ae8b8af442b6351d951d8c428d1c5b2da5e9827a2b97a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-datetime \
python311-DateTime \
python3dist-datetime"

RDEPENDS:${PN} += "python-abi \
python311-pytz \
python311-zope.interface"

inherit rpm
