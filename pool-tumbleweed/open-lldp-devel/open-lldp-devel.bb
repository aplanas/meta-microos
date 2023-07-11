SUMMARY = "Link Layer Discovery Protocol (LLDP) Agent"
DESCRIPTION = "This package contains the Link Layer Discovery Protocol (LLDP) Agent \
with Data Center Bridging (DCB) for Intel(R) Network Connections \
'lldpad' plus the configuration tools 'dcbtool' and 'lldptool'."
LICENSE = "GPL-2.0-only"

PV = "1.1+58.8ca361bab766"

RPM_NAME = "open-lldp-devel-1.1+58.8ca361bab766-1.4.aarch64.rpm"
RPM_HASH = "8d4dfaffad38d9222aac53bcb393b0b8aa901975c990ab17361a56f09c1d95b6d5e0299701379be859c90f9ec36b7e531045970883a2e795a4b39038bb5f5a17"

RPROVIDES:${PN} += "dcbd-devel \
lldpad-devel \
open-lldp-devel \
pkgconfig-liblldp-clif \
pkgconfig-lldpad"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblldp-clif1 \
open-lldp"

inherit rpm
