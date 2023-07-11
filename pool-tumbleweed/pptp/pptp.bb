SUMMARY = "Point-to-Point Tunneling Protocol (PPTP) Client"
DESCRIPTION = "A client for the proprietary Microsoft Point-to-Point Tunneling \
Protocol, PPTP.  It allows connections to a PPTP based VPN as used by \
employers and some cable and ADSL service providers. It requires MPPE \
support in the kernel. Use the ppp-mppe package."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.0"

RPM_NAME = "pptp-1.10.0-3.8.aarch64.rpm"
RPM_HASH = "99ee48838d4f285c426a964ea3fd307df0aa556dc3d2ce4dd8f6ed3d0c990cc241c3cc57d961c29aee6b27e059a8a15148f9f78d90abc9b3c183999b5eada2b5"

RPROVIDES:${PN} += "config-pptp \
pptp"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
