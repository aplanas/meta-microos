SUMMARY = "Easily write objects that delegate behavior"
DESCRIPTION = "Easily write objects that delegate behavior"
LICENSE = "LGPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "python311-lazr.delegates-2.1.0-1.1.noarch.rpm"
RPM_HASH = "52d2cc0def7a5875bcd54c55b7211422b9f23ca43e8060c3ea553103ee791bc2296b7eb4a3791d89c6b05436096c3aa049519169dd841ba67d05465f86ae028b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazr.delegates \
python3.11dist-lazr.delegates \
python311-lazr.delegates \
python3dist-lazr.delegates"

RDEPENDS:${PN} += "python-abi \
python311-zope.interface"

inherit rpm
