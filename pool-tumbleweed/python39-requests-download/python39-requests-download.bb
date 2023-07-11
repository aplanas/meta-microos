SUMMARY = "Python module to download and save files using python-requests"
DESCRIPTION = "This module downloads files using requests and saves them to a target path."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-requests-download-0.1.2-3.1.noarch.rpm"
RPM_HASH = "e16b7c7de5b04d2842f200e7ea43218c7e72e288d3bbfdc236b280c9c1f6e7bcd6ce72c962c39c36abd330cb543e18c8975f18bd7404ee4b043abed878b8b12c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-download \
python39-requests-download \
python3dist-requests-download"

RDEPENDS:${PN} += "python-abi \
python39-progressbar \
python39-requests"

inherit rpm
