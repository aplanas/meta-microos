SUMMARY = "PCIe Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor PCIe errors."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-pcie-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "bfb7c629793edd914ee70f34766397db27843334dcf6e62b96ec2d9f14cf6f5618a82e2383a74ed4d38cf1aebcbc0d30108cad02e189d3f9ea8b5cbcf3071ec5"

RPROVIDES:${PN} += "collectd-plugin-pcie"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
