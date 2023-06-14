SUMMARY = "Python X11 interface"
DESCRIPTION = "The Python X Library is intended to be a fully functional X client \
library for Python programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.33"

RPM_NAME = "python39-python-xlib-0.33-1.1.noarch.rpm"
RPM_HASH = "b350320f21c320cfcfea3ebe7ef5cce1f1a92c68bb8aab284651e7f1be7ceb9c1d167f982b33d9300209a95082e7b3233d87dfdadcd32520cfca937dcf34768f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-xlib \
python39-python-xlib \
python39-xlib \
python3dist-python-xlib"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
