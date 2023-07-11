SUMMARY = "A Dead Simple VPN"
DESCRIPTION = "DSVPN is a Dead Simple VPN, designed to address the most common \
use case for using a VPN: \
 \
[client device] -- (untrusted network) -- [vpn server] -- [the Internet] \
 \
Features: \
 * Runs on TCP. Works pretty much everywhere, including on public WiFi \
   where only TCP/443 is open or reliable. \
 * Uses only modern cryptography, with formally verified implementations. \
 * Small and constant memory footprint. Doesn't perform any heap memory \
   allocations. \
 * Small (~25 KB), with an equally small and readable code base. \
 * Works out of the box. No lousy documentation to read. No configuration \
   file. No post-configuration. Run a single-line command on the server, \
   a similar one on the client and you're done. \
   No firewall and routing rules to manually mess with. \
 * Doesn't leak between reconnects if the network doesn't change. \
   Blocks IPv6 on the client to prevent IPv6 leaks."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "dsvpn-0.1.4-1.15.aarch64.rpm"
RPM_HASH = "d78bd09789889d7afee8cd11b6ff083ce62dcb04c4713cee223f23b8a33f99d1990737b21acf7642879d64f8ab858cc771538dd0935b734f73b8312ce64ddc71"

RPROVIDES:${PN} += "dsvpn"

RDEPENDS:${PN} += "iproute2 \
iptables \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
