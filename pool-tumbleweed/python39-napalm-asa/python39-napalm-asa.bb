SUMMARY = "NAPALM - Cisco ASA Driver network driver"
DESCRIPTION = "Cisco ASA Driver implementation for the NAPALM Network Automation Project. \
This driver makes use of the Cisco ASA REST API. The REST API is only \
available from software version 9.3.2 and up, and on the 5500-X series, \
ASAv, ASA on Firepower and ISA 3000 platforms."
LICENSE = "Apache-2.0"

PV = "20180525.8c54a85"

RPM_NAME = "python39-napalm-asa-20180525.8c54a85-1.5.noarch.rpm"
RPM_HASH = "6cd7900ae179581aea57718c7488e154947d8599e0e6e790ac511a633c86437003c3a5ada41b7042a9696a125a6d7583b0e56524c27dde0a4b22479dcd1ef40a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-napalm-asa \
python39-napalm-asa \
python3dist-napalm-asa"

RDEPENDS:${PN} += "python-abi \
python39-napalm"

inherit rpm
