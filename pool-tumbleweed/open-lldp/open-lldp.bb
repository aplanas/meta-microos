SUMMARY = "Link Layer Discovery Protocol (LLDP) Agent"
DESCRIPTION = "This package contains the Link Layer Discovery Protocol (LLDP) Agent \
with Data Center Bridging (DCB) for Intel(R) Network Connections \
'lldpad' plus the configuration tools 'dcbtool' and 'lldptool'."
LICENSE = "GPL-2.0-only"

PV = "1.1+58.8ca361bab766"

RPM_NAME = "open-lldp-1.1+58.8ca361bab766-1.3.aarch64.rpm"
RPM_HASH = "4ff06178dee6aeb487c63037e6bafd1938ac998d17448f536f56ce20f2714632a5bb08770c53cd2dacc07688564d9cade5369803314e6b594808e687f6575bfb"

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
