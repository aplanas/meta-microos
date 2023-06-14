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

RPM_NAME = "dnsmasq-2.89-4.1.aarch64.rpm"
RPM_HASH = "db1d30721c058b9c15fbc60d6ece523c39a7f69ca3afe040e0ce596bbae1a40779f4d880939afe3968d432a754ec81017b2043d96b05f027ecd5954b5fa66e4b"

RPROVIDES:${PN} += "config-dnsmasq \
dns-daemon \
dnsmasq \
group-dnsmasq \
user-dnsmasq"

RDEPENDS:${PN} += "/bin/sh \
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
