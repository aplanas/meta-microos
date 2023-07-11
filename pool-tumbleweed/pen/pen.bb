SUMMARY = "A simple load balancer for TCP-based protocols"
DESCRIPTION = "Pen is a load balancer for 'simple' TCP-based protocols such as HTTP or \
SMTP. It allows several servers to appear as one to the outside and \
automatically detects servers that are down and distributes clients \
among the available servers. This gives high availability and scalable \
performance. \
 \
The load balancing algorithm keeps track of clients and will try to \
send them back to the server they visited the last time. This is useful \
for applications that maintain state between connections in the server, \
including most modern web applications. \
 \
When pen detects that a server is unavailable, it scans for another \
starting with the server after the most recently used one. That way we \
get load balancing and 'fair' failover for free. \
 \
Correctly configured, pen can ensure that a server farm is always \
available, even when individual servers are brought down for \
maintenance or reconfiguration. \
 \
The final single point of failure, pen itself, can be eliminated by \
running pen on several servers, using VRRP to decide which is active."
LICENSE = "GPL-2.0-or-later"

PV = "0.34.1"

RPM_NAME = "pen-0.34.1-1.13.aarch64.rpm"
RPM_HASH = "7dd9f3563513156290290a512de04b132ac2b0c47feb813da6fd39fe42884d010157098671f9ed1d9dabe1ab7357a2ad7b486e24efffff763a3a8b2cc617b3b5"

RPROVIDES:${PN} += "config-pen \
pen"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
