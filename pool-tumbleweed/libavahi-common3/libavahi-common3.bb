SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-common3-0.8-23.1.aarch64.rpm"
RPM_HASH = "56ac0b59fd94fd74b6e1d91824bbea737470eb9e5bd8146da2bb64b7587141dc5de6ff731937e2f26107868d67562d227bff005060382e4676e011515b9aeca6"

RPROVIDES:${PN} += "libavahi-common.so.3 \
libavahi-common3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
