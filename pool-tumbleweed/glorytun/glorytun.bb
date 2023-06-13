SUMMARY = "A small, simple and secure VPN"
DESCRIPTION = "Glorytun is a small, simple and secure VPN over MUD. \
MUD (Multipath UDP Deflector) is a secure, multipath network protocol \
over UDP. \
 \
The key features of Glorytun come directly from MUD: \
 * Fast and highly secure \
 * Multipath and failover \
 * Traffic shaping \
 * Path MTU discovery without ICMP"
LICENSE = "BSD-2-Clause"

PV = "0.3.4"

RPM_NAME = "glorytun-0.3.4-1.12.aarch64.rpm"
RPM_HASH = "f4cc48036a8c5cc4c4c9216977a9f0fd0b71bb73b37caf863b530367a5f7c231f61370f5148de708a088586f1aba9c8a57cd93a063a77d415c6e37d0e50f079e"

RPROVIDES:${PN} += "glorytun \
glorytun(aarch-64)"

RDEPENDS:${PN} += "iproute2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsodium.so.23()(64bit)"

inherit rpm
