SUMMARY = "Packet creation and parsing module for Python"
DESCRIPTION = "A packet creation / parsing module for Python, with definitions for \
the basic TCP/IP protocols."
LICENSE = "BSD-3-Clause"

PV = "1.9.7.2"

RPM_NAME = "python310-dpkt-1.9.7.2-1.10.noarch.rpm"
RPM_HASH = "8df318eb956cca35b081cee92e369a830355e8e14a2be0e41603de148cce733159678066f6bce8d3a1bd8790374ba9b2898b81d902654297080bd0d86df5d8a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dpkt \
python310-dpkt \
python3dist-dpkt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
