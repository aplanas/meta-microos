SUMMARY = "Packet creation and parsing module for Python"
DESCRIPTION = "A packet creation / parsing module for Python, with definitions for \
the basic TCP/IP protocols."
LICENSE = "BSD-3-Clause"

PV = "1.9.7.2"

RPM_NAME = "python39-dpkt-1.9.7.2-1.10.noarch.rpm"
RPM_HASH = "15422ef175a7dc53fd14fb97e63565fea4f69ce0810ea80a9d561ee0ec5fcd2e2c702448e45b149072d74308b4b504767d395d0a87be4ad6a001204f387121f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dpkt \
python39-dpkt \
python3dist-dpkt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
