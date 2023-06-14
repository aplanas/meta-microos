SUMMARY = "Python library to provide visual text-based progress to long running operations"
DESCRIPTION = "A Python Progressbar library to provide visual (yet text based) progress to long running operations."
LICENSE = "BSD-3-Clause"

PV = "4.2.0"

RPM_NAME = "python310-progressbar2-4.2.0-2.2.noarch.rpm"
RPM_HASH = "04e27ffdf40a3c08d780a43dc6368105d8a8cd50a89dd4d88e1745a92668eceb4ab4ac168266b619e04c07beb8d3fe592b6d9e6aee2ed74f540869da24666bd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-progressbar2 \
python3.10dist-progressbar2 \
python310-progressbar2 \
python3dist-progressbar2"

RDEPENDS:${PN} += "python-abi \
python310-python-utils"

inherit rpm
