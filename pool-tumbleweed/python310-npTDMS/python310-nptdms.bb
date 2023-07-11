SUMMARY = "Python module for reading TDMS files produced by LabView"
DESCRIPTION = "NumPy based module for reading TDMS files produced by LabView."
LICENSE = "LGPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python310-npTDMS-1.2.0-1.10.noarch.rpm"
RPM_HASH = "24ba509f9fca4ed2824b1a80736ac32b011be9726e50e8fc509058cb18c97cfde5017570a40a201b62aea16266cf023fdd26521cc6aaf755a800d69f3f4d1ca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nptdms \
python310-npTDMS \
python3dist-nptdms"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-numpy \
update-alternatives"

inherit rpm
