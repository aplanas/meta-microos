SUMMARY = "Zope 3 Deprecation Infrastructure"
DESCRIPTION = "This package contains documentation files for python-zope.deprecation."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python-zope.deprecation-doc-5.0-2.2.noarch.rpm"
RPM_HASH = "634fb1615fdcc39a9f0caeecaf2949c80be70b71de3387594b981988b957dd438cc2fee2a88898e2a9713b6f246681464b9a1535864d2c9e3439eaab578b790b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.deprecation-doc \
python310-zope.deprecation-doc \
python311-zope.deprecation-doc \
python39-zope.deprecation-doc"

RDEPENDS:${PN} += ""

inherit rpm
