SUMMARY = "Obtain the IP address for a given host/domain"
DESCRIPTION = "This plugin uses the nslookup program to obtain the IP address for the given \
host/domain query. \
 \
An optional DNS server to use may be specified. If no DNS server is specified, \
the default server(s) specified in /etc/resolv.conf will be used."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dns-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "c0b0d810ec1cbaf075f3ee9917c174ceec1a445181fdc9a65de1b25332de0859373465b24bc68ba793bfdc849fd95641c51b090e508aab1c2335513397631898"

RPROVIDES:${PN} += "monitoring-plugins-dns \
monitoring-plugins-dns(aarch-64) \
nagios-plugins-dns"
RDEPENDS:${PN} += "/usr/bin/nslookup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
