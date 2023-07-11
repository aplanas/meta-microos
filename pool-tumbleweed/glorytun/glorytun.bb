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

RPM_NAME = "glorytun-0.3.4-1.13.aarch64.rpm"
RPM_HASH = "0c02c501c2983011c0ad7e30804a390a83010cbe304ccdb379cb16fd4fdce1652e5e3f8ce913056353314b8d21ce3ad8d512c20beec2c644ee1702fde16be173"

RPROVIDES:${PN} += "glorytun"

RDEPENDS:${PN} += "iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.23"

inherit rpm
