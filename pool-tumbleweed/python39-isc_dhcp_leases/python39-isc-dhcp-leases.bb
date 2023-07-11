SUMMARY = "Python module for reading dhcpd.leases from ISC DHCP server"
DESCRIPTION = "Python module for reading dhcpd.leases from ISC DHCP server. \
This module also supports reading lease files from the ISC DHCP daemon \
running in IPv6 mode."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python39-isc_dhcp_leases-0.9.1-3.5.noarch.rpm"
RPM_HASH = "94ebbf8840ea6306736582dc02c8920cf9949445d318837ba96cc0cf601263f07ad9ae33bc8f8ebc5c353a27c98ecd4d34190d4911e1aaa06b294ef2e62e9bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-isc-dhcp-leases \
python39-isc-dhcp-leases \
python3dist-isc-dhcp-leases"

RDEPENDS:${PN} += "python-abi"

inherit rpm
