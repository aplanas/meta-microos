SUMMARY = "Python module for reading dhcpd.leases from ISC DHCP server"
DESCRIPTION = "Python module for reading dhcpd.leases from ISC DHCP server. \
This module also supports reading lease files from the ISC DHCP daemon \
running in IPv6 mode."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python311-isc_dhcp_leases-0.9.1-3.5.noarch.rpm"
RPM_HASH = "316b1304dd025f29190498d7a94a892300141bafd2a4305af600e93f17ab9a4febc92c6980eb732047dc00607635a0bab77a3df498200c47cf1635a9349d2af1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isc-dhcp-leases \
python3.11dist-isc-dhcp-leases \
python311-isc-dhcp-leases \
python3dist-isc-dhcp-leases"

RDEPENDS:${PN} += "python-abi"

inherit rpm
