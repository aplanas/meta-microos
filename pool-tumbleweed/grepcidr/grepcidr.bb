SUMMARY = "Filter IP addresses matching IPv4/IPv6 CIDR specification"
DESCRIPTION = "grepcidr can be used as a stream filter when you need to compare a list of IP \
addresses against one or more Classless Inter-Domain Routing (CIDR) mask \
specifications. Think of grepcidr as a CIDR-aware grep; instead of using \
'grep 1.2.3.4' you can use 'grepcidr -e 1.2.3.4/30', for example. Multiple \
specifications, of arbitrary mask lengths, can be specified both on the \
command line or loaded from a file."
LICENSE = "GPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "grepcidr-2.0-1.10.aarch64.rpm"
RPM_HASH = "1608f3117215e37b77c73d1e8bce025c0827ec5a865439f83b5dab9c886be1ea7a13663e930e4eb60a4d7b5c2fbfa9ec8e2f2ee099651f2cfc8a76911ab30bad"

RPROVIDES:${PN} += "grepcidr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
