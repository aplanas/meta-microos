SUMMARY = "DNS Forwarder and DHCP Server"
DESCRIPTION = "Dnsmasq provides network infrastructure for small networks: DNS, \
DHCP, router advertisement and network boot. \
 \
The DNS subsystem supprots forwarding of all query types, and caching \
of common record types, DNSSEC included. The DHCP subsystem supports \
DHCPv4, DHCPv6, BOOTP and PXE. RA can be used stand-alone or in \
conjunction with DHCPv6."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.89"

RPM_NAME = "dnsmasq-2.89-4.2.aarch64.rpm"
RPM_HASH = "ce49e5e7685150c5958cb49933046e58c11673bb5369bd1c0e4a1b69c9616d10c48fe36a9cfac450852de9eaa180be0be505e46d2b85f364c57a950778c53bbe"

RPROVIDES:${PN} += "config-dnsmasq \
dns-daemon \
dnsmasq \
group-dnsmasq \
user-dnsmasq"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgmp.so.10 \
libhogweed.so.6 \
libidn2.so.0 \
liblua5.4.so.5 \
libnetfilter-conntrack.so.3 \
libnettle.so.8 \
sysuser-shadow \
user-tftp"

inherit rpm
