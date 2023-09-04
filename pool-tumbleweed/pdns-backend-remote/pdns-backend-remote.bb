SUMMARY = "Remote backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the remote backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-remote-4.8.0-1.2.aarch64.rpm"
RPM_HASH = "47f7eb204e75ecfa191ef96dd47effc3837d3127016d3bef179afd8c3f75e585f291784502f71a7890017c8b7447863d9e394cd1f92acc423bd9059df5fd6afc"

RPROVIDES:${PN} += "libremotebackend.so \
pdns-backend-remote"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzmq.so.5 \
pdns"

inherit rpm
