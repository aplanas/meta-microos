SUMMARY = "Python module for reading dhcpd.leases from ISC DHCP server"
DESCRIPTION = "Python module for reading dhcpd.leases from ISC DHCP server. \
This module also supports reading lease files from the ISC DHCP daemon \
running in IPv6 mode."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python311-isc_dhcp_leases-0.9.1-3.3.noarch.rpm"
RPM_HASH = "725935cd6305a9bdb52672b7fd0d03321196240957f43461d116318342340edd984fe3fec42f68b3189494204f3cd67c02ccc32a86399535730ca0d543f3f749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(isc-dhcp-leases) \
python311-isc_dhcp_leases \
python3dist(isc-dhcp-leases)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
