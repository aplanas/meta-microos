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

RPM_NAME = "dnsmasq-2.89-3.1.aarch64.rpm"
RPM_HASH = "20992b7bd6cb6c976711b79e9b09b5d2a44ee4ee557f7856a87580dea4fdbfbe6aa3c463596f85a591849232c6eed955c7e729ed2d106c4bc0066ec61eca1138"

RPROVIDES:${PN} += "config(dnsmasq) dns_daemon dnsmasq dnsmasq(aarch-64) group(dnsmasq) user(dnsmasq)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libgmp.so.10()(64bit) libhogweed.so.6()(64bit) libhogweed.so.6(HOGWEED_6)(64bit) libidn2.so.0()(64bit) libidn2.so.0(IDN2_0.0.0)(64bit) liblua5.4.so.5()(64bit) libnetfilter_conntrack.so.3()(64bit) libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit) sysuser-shadow user(tftp)"

inherit rpm
