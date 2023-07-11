SUMMARY = "Header Files and Libraries for dhcpctl API"
DESCRIPTION = "This package contains all of the libraries and headers for developing \
with the Internet Software Consortium (ISC) dhcpctl API."
LICENSE = "MPL-2.0"

PV = "4.4.2.P1"

RPM_NAME = "dhcp-devel-4.4.2.P1-14.4.aarch64.rpm"
RPM_HASH = "b760211e94a7c30b63248d7f512caea6420a8c944feca44966f042f703df7eee513b7ba7a402c02718590b574ebfeaf7f9bc7660a8b7aa02ce78efce8e25f0a2"

RPROVIDES:${PN} += "dhcp-devel"

RDEPENDS:${PN} += "dhcp"

inherit rpm
