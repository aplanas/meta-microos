SUMMARY = "The pytzdata module for Python-pendulum"
DESCRIPTION = "The Olson timezone database for Python. This version is linked to the systemwide zone info"
LICENSE = "MIT"

PV = "2020.1"

RPM_NAME = "python310-pytzdata-2020.1-3.3.noarch.rpm"
RPM_HASH = "75dedc5a13a595a0fac46c5f33ca7a369853f644fdbb58792212860c64eac726772b2639b645af26c37af9e0c04fd4f44b547acc56ec45543fcaef14ae407692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytzdata \
python310-pytzdata \
python3dist-pytzdata"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
