SUMMARY = "Zope Exceptions"
DESCRIPTION = "This package contains exception interfaces and implementations which are so \
general purpose that they don't belong in Zope application-specific packages."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python311-zope.exceptions-4.6-2.2.noarch.rpm"
RPM_HASH = "bfcd4043941594b9b163a7fb4907ef7754b6dca261d4c5d36ef8b3a41faf5e37e0c28557674f263f6bb7dd62ad977ae752ce6dadef795ecda96f4d374329d49a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.exceptions \
python3.11dist-zope.exceptions \
python311-zope.exceptions \
python3dist-zope.exceptions"

RDEPENDS:${PN} += "python-abi \
python311-zope.interface"

inherit rpm
