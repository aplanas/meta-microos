SUMMARY = "Python package for parsing raw output of ifconfig"
DESCRIPTION = "Python package for parsing raw output of ifconfig."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python310-ifconfig-parser-0.0.5-1.14.noarch.rpm"
RPM_HASH = "eef19de4f23594d1d658a9b4832d90c8b11f0ebdace8f19cdd64d3e9b87217e72fa7727c1632eec95a94a1eb46ef7d6f438d157678e60824e6314ab3dcc5b49e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ifconfig-parser \
python3.10dist(ifconfig-parser) \
python310-ifconfig-parser \
python3dist(ifconfig-parser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
