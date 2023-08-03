SUMMARY = "Zope DateTime data type"
DESCRIPTION = "This package provides a DateTime data type, as known from Zope. \
Unless you need to communicate with Zope APIs, you're probably \
better off using Python's built-in datetime module."
LICENSE = "ZPL-2.1"

PV = "5.2"

RPM_NAME = "python39-DateTime-5.2-1.1.noarch.rpm"
RPM_HASH = "38ef20595f97b953b120b253336eca9bc3cdec7f7c0c05b278c5e0fab21d47badf484348d92a424655ff9ac889c8a423aa677a0f57d502c81704dac6e76cc0e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-datetime \
python39-DateTime \
python3dist-datetime"

RDEPENDS:${PN} += "python-abi \
python39-pytz \
python39-zope.interface"

inherit rpm
