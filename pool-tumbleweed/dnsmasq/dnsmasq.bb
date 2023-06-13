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

RPROVIDES:${PN} += "config(dnsmasq) \
dns_daemon \
dnsmasq \
dnsmasq(aarch-64) \
group(dnsmasq) \
user(dnsmasq)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgmp.so.10()(64bit) \
libhogweed.so.6()(64bit) \
libhogweed.so.6(HOGWEED_6)(64bit) \
libidn2.so.0()(64bit) \
liblua5.4.so.5()(64bit) \
libnetfilter_conntrack.so.3()(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit) \
sysuser-shadow \
user(tftp)"

inherit rpm
