SUMMARY = "Packet creation and parsing module for Python"
DESCRIPTION = "A packet creation / parsing module for Python, with definitions for \
the basic TCP/IP protocols."
LICENSE = "BSD-3-Clause"

PV = "1.9.7.2"

RPM_NAME = "python311-dpkt-1.9.7.2-1.10.noarch.rpm"
RPM_HASH = "e2362f55f93e3d3cecc57d3cf2fa16c664139f746e5189319eddb7a12b482117ec811c5b61171ca29d63385064e6b30ef4aa87d6c7216b98e08ed3cb1e5076fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dpkt \
python3.11dist-dpkt \
python311-dpkt \
python3dist-dpkt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
