SUMMARY = "Header Files and Libraries for dhcpctl API"
DESCRIPTION = "This package contains all of the libraries and headers for developing \
with the Internet Software Consortium (ISC) dhcpctl API."
LICENSE = "MPL-2.0"

PV = "4.4.2.P1"

RPM_NAME = "dhcp-devel-4.4.2.P1-14.3.aarch64.rpm"
RPM_HASH = "17d50fab779479f6d8b1f21eb5dcc1b7a4635f4a7c647faea21a64114cb155ae21139b6dfeee73eb6a434c8580c908d123027bf7f9cf2485526c1e11e8c9f837"

RPROVIDES:${PN} += "dhcp-devel"

RDEPENDS:${PN} += "dhcp"

inherit rpm
