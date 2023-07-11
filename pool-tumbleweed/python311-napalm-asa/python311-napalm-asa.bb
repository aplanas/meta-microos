SUMMARY = "NAPALM - Cisco ASA Driver network driver"
DESCRIPTION = "Cisco ASA Driver implementation for the NAPALM Network Automation Project. \
This driver makes use of the Cisco ASA REST API. The REST API is only \
available from software version 9.3.2 and up, and on the 5500-X series, \
ASAv, ASA on Firepower and ISA 3000 platforms."
LICENSE = "Apache-2.0"

PV = "20180525.8c54a85"

RPM_NAME = "python311-napalm-asa-20180525.8c54a85-1.5.noarch.rpm"
RPM_HASH = "e34ade1dd42c279c667ba992edf986e28b199d18abf43414235fec945d1de5d62242d8320ea68b66822c55fad3a6161bf34143e43d80cf9644d96f4731b677cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm-asa \
python3.11dist-napalm-asa \
python311-napalm-asa \
python3dist-napalm-asa"

RDEPENDS:${PN} += "python-abi \
python311-napalm"

inherit rpm
