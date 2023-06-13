SUMMARY = "The pytzdata module for Python-pendulum"
DESCRIPTION = "The Olson timezone database for Python. This version is linked to the systemwide zone info"
LICENSE = "MIT"

PV = "2020.1"

RPM_NAME = "python39-pytzdata-2020.1-3.1.noarch.rpm"
RPM_HASH = "aa5f0442d84d585200fe913a9d7a43589decb81beea500ea5b79eb3fe235b7e52d3e167a46ccf1917cc229bde6a8df827f5f2528fd29135a8e09d494ad34d85e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytzdata) \
python39-pytzdata \
python3dist(pytzdata)"

RDEPENDS:${PN} += "python(abi) \
timezone"

inherit rpm
