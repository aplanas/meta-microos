SUMMARY = "A tool for IPv4/IPv6 and Ethernet address pairing monitoring"
DESCRIPTION = "This is a tool similar to arpwatch. It main purpose is to monitor \
network and log discovered Ethernet to IPv4/IPv6 address \
pairings. It supports monitoring multiple network interfaces, \
monitoring of VLAN tagged (802.1Q) packets, and can output to \
stdout, plain text file, syslog, sqlite3 and MySQL. Addrwatch \
tracks IPv6 addresses of hosts using IPv6 privacy extensions \
(RFC4941). \
 \
The main difference between arpwatch and addrwatch is the format \
of output files. \
 \
While arpwatch stores only current state of the pairings and \
allows to send email notification when a pairing change occurs, \
addrwatch do not keep persistent network pairings' state, but \
instead logs all the events that allow pairing discovery."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "addrwatch-1.0.2-1.13.aarch64.rpm"
RPM_HASH = "145b1703487ebe37e95b330702746e8c5880e7f8714aaa4d37a292c0d5c10acf3b3c407f9f0311dd06117b3c4ab27c55aa6e16a6438d1c1c351da8183773e03e"

RPROVIDES:${PN} += "addrwatch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libmariadb.so.3 \
libpcap.so.1 \
libsqlite3.so.0"

inherit rpm
