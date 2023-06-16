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

RPM_NAME = "pen-0.34.1-1.12.aarch64.rpm"
RPM_HASH = "81847bc361a8d783e7b37ed61e449b4bf80f7678afb7cb9c09e3e9f864638dde5f50d04385c822d3aece5cf13229f1900f2971c056853a98a7cbbe467629ca9f"

RPROVIDES:${PN} += "config-pen \
pen"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
