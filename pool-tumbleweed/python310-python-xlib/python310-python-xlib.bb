SUMMARY = "Python X11 interface"
DESCRIPTION = "The Python X Library is intended to be a fully functional X client \
library for Python programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.33"

RPM_NAME = "python310-python-xlib-0.33-1.1.noarch.rpm"
RPM_HASH = "36c634b5864fab4917caed8802593784170f02fa180cb628fefae5863b3c0d2a45ee3429688cfdaf3a33576dfef6a930b1d401ca3a58f693a610a135794d83b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-xlib \
python3-xlib \
python3.10dist(python-xlib) \
python310-python-xlib \
python310-xlib \
python3dist(python-xlib)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
