SUMMARY = "OpenVPN plugin header"
DESCRIPTION = "This package provides the header file to build external plugins."
LICENSE = "GPL-2.0-only-with-openvpn-openssl-exception"

PV = "2.6.6"

RPM_NAME = "openvpn-devel-2.6.6-1.1.aarch64.rpm"
RPM_HASH = "096f9f257fee22dc1ceacef73c36ed7c317372d576d9e4e9f7f855dc23310350d8aef311b08539dd1d1a935f817982c8d1bc01c4b9dc7751a87d7531825e2624"

RPROVIDES:${PN} += "openvpn-devel"

RDEPENDS:${PN} += "openvpn"

inherit rpm
