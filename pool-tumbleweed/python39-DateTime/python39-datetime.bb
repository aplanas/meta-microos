SUMMARY = "Zope DateTime data type"
DESCRIPTION = "This package provides a DateTime data type, as known from Zope. \
Unless you need to communicate with Zope APIs, you're probably \
better off using Python's built-in datetime module."
LICENSE = "ZPL-2.1"

PV = "5.1"

RPM_NAME = "python39-DateTime-5.1-1.3.noarch.rpm"
RPM_HASH = "4180d6cb577e4943052e3a5934684724da521170ae242e1bd46d88f28d999766f5f9868a170f674694f0eff3e0a72f872fab1e964beb1aba2de3e62c0b06ed89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-datetime \
python39-DateTime \
python3dist-datetime"

RDEPENDS:${PN} += "python-abi \
python39-pytz \
python39-zope.interface"

inherit rpm
