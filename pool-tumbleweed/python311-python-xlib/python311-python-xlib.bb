SUMMARY = "Python X11 interface"
DESCRIPTION = "The Python X Library is intended to be a fully functional X client \
library for Python programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.33"

RPM_NAME = "python311-python-xlib-0.33-2.1.noarch.rpm"
RPM_HASH = "537808d660342af9d7bacc7528f836d08191a7160ff50d06486c582c8389d4c368106fb0144de828a41deef4f84a9784067b66fe42297ac5cd1c4dd6c085906b"
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
