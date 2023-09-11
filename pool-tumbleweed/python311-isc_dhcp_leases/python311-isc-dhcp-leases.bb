SUMMARY = "Python module for reading dhcpd.leases from ISC DHCP server"
DESCRIPTION = "Python module for reading dhcpd.leases from ISC DHCP server. \
This module also supports reading lease files from the ISC DHCP daemon \
running in IPv6 mode."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python311-isc_dhcp_leases-0.10.0-1.1.noarch.rpm"
RPM_HASH = "21e8a359e4b0460657fc3aa3423ecaedf1b6a4c15e31aee62c5465f24d9b09271d50950d0fba27dfe09174c38fbab069b5209eb4ffb856d440b6341dca418bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isc-dhcp-leases \
python3.11dist-isc-dhcp-leases \
python311-isc-dhcp-leases \
python3dist-isc-dhcp-leases"

RDEPENDS:${PN} += "python-abi"

inherit rpm
