SUMMARY = "Link Layer Discovery Protocol (LLDP) Agent"
DESCRIPTION = "This package contains the Link Layer Discovery Protocol (LLDP) Agent \
with Data Center Bridging (DCB) for Intel(R) Network Connections \
'lldpad' plus the configuration tools 'dcbtool' and 'lldptool'."
LICENSE = "GPL-2.0-only"

PV = "1.1+58.8ca361bab766"

RPM_NAME = "open-lldp-1.1+58.8ca361bab766-1.4.aarch64.rpm"
RPM_HASH = "4f5dc6fee21241d334e3c324dc274e89f26a1119502e223e519974164fc27f0e8fcc6cf06dc5bc930868650708d3215d23576b18796fe0e5225384dbc1ad21a5"

RPROVIDES:${PN} += "dcbd \
lldpad \
open-lldp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.11 \
liblldp-clif.so.1 \
libnl-3.so.200 \
systemd"

inherit rpm
