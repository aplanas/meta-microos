SUMMARY = "Python module for reading dhcpd.leases from ISC DHCP server"
DESCRIPTION = "Python module for reading dhcpd.leases from ISC DHCP server. \
This module also supports reading lease files from the ISC DHCP daemon \
running in IPv6 mode."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python310-isc_dhcp_leases-0.9.1-3.3.noarch.rpm"
RPM_HASH = "f41cdec916a361b8f1c8fd8604ae5db370fb02587e8815a605b25b3b38c6f007c53cfb195076969cf54273d1a7bcb3d82757ea348919c2a50b11263b9529a90d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isc_dhcp_leases \
python3.10dist(isc-dhcp-leases) \
python310-isc_dhcp_leases \
python3dist(isc-dhcp-leases)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
