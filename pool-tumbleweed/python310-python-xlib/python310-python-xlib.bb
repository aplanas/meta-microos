SUMMARY = "Python X11 interface"
DESCRIPTION = "The Python X Library is intended to be a fully functional X client \
library for Python programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.33"

RPM_NAME = "python310-python-xlib-0.33-2.1.noarch.rpm"
RPM_HASH = "a041d3f0c7d34b7065cb3fb2196d1370e3d5ba503d84e179e638c1d18ae5efc72a5e9bd33defd9afd0167885f5b0905979a47a0a386693d978958d8d4018b713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-xlib \
python310-python-xlib \
python310-xlib \
python3dist-python-xlib"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
