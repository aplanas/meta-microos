SUMMARY = "High-level Python Bindings for CUPS"
DESCRIPTION = "This package provides high-level python bindings for CUPS, and can be \
used on top of python3-cups."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "python3-cupshelpers-1.5.18-2.2.noarch.rpm"
RPM_HASH = "1c82cd9f12f2852e8b78cef4ac5178119dc444c40288bcdd7d8a38d8afd164fe4889c3d0af5a0e50306a962bebba5bf92ce6b51eebf01cd1a6b75f70ad58ba07"
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
