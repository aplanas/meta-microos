SUMMARY = "High-level Python Bindings for CUPS"
DESCRIPTION = "This package provides high-level python bindings for CUPS, and can be \
used on top of python3-cups."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "python3-cupshelpers-1.5.18-3.1.noarch.rpm"
RPM_HASH = "b73bc42540992f8f66a8b49fb92d9ab80538841f755443f8b1858618fd8ff00019da43e99c6fee2dd445ef163d1903d6a23bebcba0ef70972e66efa2e5691865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-cupshelpers \
python3-cupshelpers \
python3.11dist-cupshelpers \
python3dist-cupshelpers"

RDEPENDS:${PN} += "python-abi \
python3-cups \
python3-pycurl \
python3-requests"

inherit rpm
