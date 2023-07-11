SUMMARY = "Easily write objects that delegate behavior"
DESCRIPTION = "Easily write objects that delegate behavior"
LICENSE = "LGPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "python310-lazr.delegates-2.1.0-1.1.noarch.rpm"
RPM_HASH = "8dcc8d311830bc18287029e1d91408d9c72a5fabcca3f3a2d6f83eab6e65d7515eba7fa6677ae442e568fc3468ab22785919baa6052948f7a5d86a408656ec42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lazr.delegates \
python310-lazr.delegates \
python3dist-lazr.delegates"

RDEPENDS:${PN} += "python-abi \
python310-zope.interface"

inherit rpm
