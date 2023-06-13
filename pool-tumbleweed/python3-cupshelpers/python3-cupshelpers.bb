SUMMARY = "High-level Python Bindings for CUPS"
DESCRIPTION = "This package provides high-level python bindings for CUPS, and can be \
used on top of python3-cups."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "python3-cupshelpers-1.5.18-2.1.noarch.rpm"
RPM_HASH = "12f2fb3d2ab6c769edac8e01b87bf056cddc7b996435f39a3263e575e0066d2e32feaa889a9d9837cfcc0845a512b162ac76e78dfa7547a94683800d019a629c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(python3-cupshelpers) \
python3-cupshelpers \
python3.10dist(cupshelpers) \
python3dist(cupshelpers)"

RDEPENDS:${PN} += "python(abi) \
python3-cups \
python3-pycurl \
python3-requests"

inherit rpm
