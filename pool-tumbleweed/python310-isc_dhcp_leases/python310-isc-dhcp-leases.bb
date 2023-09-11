SUMMARY = "Python module for reading dhcpd.leases from ISC DHCP server"
DESCRIPTION = "Python module for reading dhcpd.leases from ISC DHCP server. \
This module also supports reading lease files from the ISC DHCP daemon \
running in IPv6 mode."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python310-isc_dhcp_leases-0.10.0-1.1.noarch.rpm"
RPM_HASH = "aa915b25f25d69a5c6822718b90b5643d5e67cae7503b3ce85dcc88457088a541a74e59d546ca568143f90f53b7ee7cb5865011c8fd043b2ed282e95ee4042f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-isc-dhcp-leases \
python310-isc-dhcp-leases \
python3dist-isc-dhcp-leases"

RDEPENDS:${PN} += "python-abi"

inherit rpm
