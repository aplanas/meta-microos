SUMMARY = "Python X11 interface"
DESCRIPTION = "The Python X Library is intended to be a fully functional X client \
library for Python programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.33"

RPM_NAME = "python39-python-xlib-0.33-1.2.noarch.rpm"
RPM_HASH = "5bccb72048d8f2a7a056c528a93f28d0e7807193b989194e597c22decd3f684cae0b32108324c8cc7d033dc613beb0f42e4041b1a8de013d417d23a6f09d9731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-xlib \
python39-python-xlib \
python39-xlib \
python3dist-python-xlib"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
