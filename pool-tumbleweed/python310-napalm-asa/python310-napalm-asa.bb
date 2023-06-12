SUMMARY = "NAPALM - Cisco ASA Driver network driver"
DESCRIPTION = "Cisco ASA Driver implementation for the NAPALM Network Automation Project. \
This driver makes use of the Cisco ASA REST API. The REST API is only \
available from software version 9.3.2 and up, and on the 5500-X series, \
ASAv, ASA on Firepower and ISA 3000 platforms."
LICENSE = "Apache-2.0"

PV = "20180525.8c54a85"

RPM_NAME = "python310-napalm-asa-20180525.8c54a85-1.3.noarch.rpm"
RPM_HASH = "aeebe495acc5175d3bd710dae31db14580a3eaa2ac02756dcad698b27ed91f5862e6e3ec66a6d234e76b85471ea71d2012f0b2f776980bff297caa5932705fae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-napalm-asa \
python3.10dist(napalm-asa) \
python310-napalm-asa \
python3dist(napalm-asa)"
RDEPENDS:${PN} += "python(abi) \
python310-napalm"

inherit rpm
