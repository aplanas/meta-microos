SUMMARY = "Python X11 interface"
DESCRIPTION = "The Python X Library is intended to be a fully functional X client \
library for Python programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.33"

RPM_NAME = "python311-python-xlib-0.33-1.2.noarch.rpm"
RPM_HASH = "6e538c79ae7aa13ac4f90eb8cb5a1d2286ded2bc49a92a309aa988a3c0255504a7044a75a860f55367ddd16d52bea3e95e2480eeaa52244d77754333e7ee308d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-xlib \
python3-xlib \
python3.11dist-python-xlib \
python311-python-xlib \
python311-xlib \
python3dist-python-xlib"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
