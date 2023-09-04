SUMMARY = "Python X11 interface"
DESCRIPTION = "The Python X Library is intended to be a fully functional X client \
library for Python programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.33"

RPM_NAME = "python39-python-xlib-0.33-2.1.noarch.rpm"
RPM_HASH = "c5f98004be000a6dc695eb024b03d83c6d2b4e3b6c2fece89eb0a1145936e1527315290f7071f001013ceed16aa3e9bc68199f682f2d944d08b6b5ab721ca0f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-xlib \
python39-python-xlib \
python39-xlib \
python3dist-python-xlib"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
