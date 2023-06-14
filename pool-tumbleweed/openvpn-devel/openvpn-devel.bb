SUMMARY = "OpenVPN plugin header"
DESCRIPTION = "This package provides the header file to build external plugins."
LICENSE = "GPL-2.0-only-WITH-openvpn-openssl-exception"

PV = "2.6.4"

RPM_NAME = "openvpn-devel-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "0c49458eb24c482c1a9b01512d117e08ba9e4534a84c61cdf683651a7b44f3c23d3c6384b20826c64f2e570d093cddc4903fec23c491b5be2487f9ea56e351f7"

RPROVIDES:${PN} += "openvpn-devel"

RDEPENDS:${PN} += "openvpn"

inherit rpm
