SUMMARY = "Python module for reading dhcpd.leases from ISC DHCP server"
DESCRIPTION = "Python module for reading dhcpd.leases from ISC DHCP server. \
This module also supports reading lease files from the ISC DHCP daemon \
running in IPv6 mode."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python310-isc_dhcp_leases-0.9.1-3.5.noarch.rpm"
RPM_HASH = "2c7cbe2fb8bd1836f8b3011058fa254830e302b70721599e0397a2413caf2b8020f599f74a1f4d097efa5453a4fff9c58399c4853244ed228a565c54b0b20537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-isc-dhcp-leases \
python310-isc-dhcp-leases \
python3dist-isc-dhcp-leases"

RDEPENDS:${PN} += "python-abi"

inherit rpm
