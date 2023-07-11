SUMMARY = "Obtain the IP address for a given host/domain"
DESCRIPTION = "This plugin uses the nslookup program to obtain the IP address for the given \
host/domain query. \
 \
An optional DNS server to use may be specified. If no DNS server is specified, \
the default server(s) specified in /etc/resolv.conf will be used."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dns-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "4da203ef88d895186a1db7b4ac847cbab3da79b2664567b90dc75863d3073b6776af9ca2239f406f7c65b400355b847311a182c4bc93b9dcf5c3837f0d3e49ee"

RPROVIDES:${PN} += "monitoring-plugins-dns \
nagios-plugins-dns"

RDEPENDS:${PN} += "/usr/bin/nslookup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
