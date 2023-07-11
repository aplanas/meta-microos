SUMMARY = "A tunnel which can improve network quality by using FEC"
DESCRIPTION = "A tunnel which can improve network quality on high-latency and \
lossy links by using Forward Error Correction, for all kinds of \
traffic (TCP/UDP/ICMP). \
 \
When used alone, UDPspeeder improves only the UDP connection. By using \
UDPspeeder and a UDP-based VPN together, any traffic can be improved. \
Currently, OpenVPN/L2TP/ShadowVPN are known to be supported."
LICENSE = "MIT"

PV = "20230206.0"

RPM_NAME = "udpspeeder-20230206.0-1.1.aarch64.rpm"
RPM_HASH = "46c4adbf488be29f57729fcecdf9ddb7da020316541cea89602f88bfc3e2f16d253b89a8c8f465b57604cb590aaa37278430858f72d74c8787d53dd987603ceb"

RPROVIDES:${PN} += "udpspeeder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
