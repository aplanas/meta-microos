SUMMARY = "Python Wireless Library"
DESCRIPTION = "PyRIC is a (Linux-only) library providing wireless developers and pentesters the \
ability to identify, enumerate and manipulate their system's wireless cards \
programmatically in Python."
LICENSE = "GPL-3.0-only"

PV = "0.1.6.3"

RPM_NAME = "python310-PyRIC-0.1.6.3-3.15.noarch.rpm"
RPM_HASH = "3c8906da4466e8b1418489805d21ecd19c37f74ed77650c5961936f2836bd2028b0d730580aa403c2e3e27c5a596bf74f49313d3655cc05f1c227a93bebdd643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyric \
python310-PyRIC \
python3dist-pyric"

RDEPENDS:${PN} += "python-abi"

inherit rpm
