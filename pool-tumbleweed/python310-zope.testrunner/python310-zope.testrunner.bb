SUMMARY = "Zope testrunner script"
DESCRIPTION = "This package provides a flexible test runner with layer support."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python310-zope.testrunner-6.0-2.3.noarch.rpm"
RPM_HASH = "33f1f5c8c04bf7622ee47e98eed80736b13eaaf154bcb5eccd9537a5b60cba231210017d49a51a4848ec6dae189c5dcfd28f10b2f64928740089de5d32e2383d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.testrunner \
python310-zope.testrunner \
python3dist-zope.testrunner"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-zope.exceptions \
python310-zope.interface \
update-alternatives"

inherit rpm
