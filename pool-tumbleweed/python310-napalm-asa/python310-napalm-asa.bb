SUMMARY = "NAPALM - Cisco ASA Driver network driver"
DESCRIPTION = "Cisco ASA Driver implementation for the NAPALM Network Automation Project. \
This driver makes use of the Cisco ASA REST API. The REST API is only \
available from software version 9.3.2 and up, and on the 5500-X series, \
ASAv, ASA on Firepower and ISA 3000 platforms."
LICENSE = "Apache-2.0"

PV = "20180525.8c54a85"

RPM_NAME = "python310-napalm-asa-20180525.8c54a85-1.5.noarch.rpm"
RPM_HASH = "932f4554deb66698d0a2deeda2de6706d289c78ee06b7ad306e2331912184c6c7d88e28440572787d5eccc7bdd43c397e830ceb16fbaeae4f0b6ed0c48874348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-napalm-asa \
python310-napalm-asa \
python3dist-napalm-asa"

RDEPENDS:${PN} += "python-abi \
python310-napalm"

inherit rpm
