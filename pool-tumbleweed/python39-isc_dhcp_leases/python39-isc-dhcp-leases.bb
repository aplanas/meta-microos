SUMMARY = "Python module for reading dhcpd.leases from ISC DHCP server"
DESCRIPTION = "Python module for reading dhcpd.leases from ISC DHCP server. \
This module also supports reading lease files from the ISC DHCP daemon \
running in IPv6 mode."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python39-isc_dhcp_leases-0.10.0-1.1.noarch.rpm"
RPM_HASH = "0f1104d7ae2af46cd3d4fddcee3019aef9580ed497ecd484237f2e665486f7a203333adf57afd4c5af14f122930f65516bfa343540bee4baa6feb9c947d44a18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-isc-dhcp-leases \
python39-isc-dhcp-leases \
python3dist-isc-dhcp-leases"

RDEPENDS:${PN} += "python-abi"

inherit rpm
