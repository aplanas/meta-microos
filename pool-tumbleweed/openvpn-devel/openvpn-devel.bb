SUMMARY = "OpenVPN plugin header"
DESCRIPTION = "This package provides the header file to build external plugins."
LICENSE = "GPL-2.0-only-with-openvpn-openssl-exception"

PV = "2.6.5"

RPM_NAME = "openvpn-devel-2.6.5-1.1.aarch64.rpm"
RPM_HASH = "6341a25358f89e2a58417b2741010b8686ed01e2d24deb00c74d9530725842fddbefaa2624ca7a330d99c3f3aa55accd7a13d8135c30b7c09f7432244597531b"

RPROVIDES:${PN} += "openvpn-devel"

RDEPENDS:${PN} += "openvpn"

inherit rpm
