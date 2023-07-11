SUMMARY = "Python X11 interface"
DESCRIPTION = "The Python X Library is intended to be a fully functional X client \
library for Python programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.33"

RPM_NAME = "python310-python-xlib-0.33-1.2.noarch.rpm"
RPM_HASH = "05393aff0fe9ae101939ae86681416843f39fb027574a30d9b96c6dbef35475c5a96f5707b8ea4a781d66fe2866e8a9a19a5999a0fcb1afecd26f4dc696edee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-xlib \
python310-python-xlib \
python310-xlib \
python3dist-python-xlib"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
