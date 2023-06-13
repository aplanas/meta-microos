SUMMARY = "Link Layer Discovery Protocol (LLDP) Agent"
DESCRIPTION = "This package contains the Link Layer Discovery Protocol (LLDP) Agent \
with Data Center Bridging (DCB) for Intel(R) Network Connections \
'lldpad' plus the configuration tools 'dcbtool' and 'lldptool'."
LICENSE = "GPL-2.0-only"

PV = "1.1+58.8ca361bab766"

RPM_NAME = "open-lldp-devel-1.1+58.8ca361bab766-1.3.aarch64.rpm"
RPM_HASH = "7271978fe4d9c142e0de9fa8d0063b051da57495672652796b2244661e0495495d3140ec10c28a9b48e0fec08fd8b9369a6eb6e2e6c2a42b9ca247d8adfcad6a"

RPROVIDES:${PN} += "dcbd-devel \
lldpad-devel \
open-lldp-devel \
open-lldp-devel(aarch-64) \
pkgconfig(liblldp_clif) \
pkgconfig(lldpad)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblldp_clif1 \
open-lldp"

inherit rpm
