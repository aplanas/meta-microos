SUMMARY = "A tunnel which can improve network quality by using FEC"
DESCRIPTION = "A tunnel which can improve network quality on high-latency and \
lossy links by using Forward Error Correction, for all kinds of \
traffic (TCP/UDP/ICMP). \
 \
When used alone, UDPspeeder improves only the UDP connection. By using \
UDPspeeder and a UDP-based VPN together, any traffic can be improved. \
Currently, OpenVPN/L2TP/ShadowVPN are known to be supported."
LICENSE = "MIT"

PV = "20210116.0"

RPM_NAME = "udpspeeder-20210116.0-1.10.aarch64.rpm"
RPM_HASH = "35eac600d531704699a060e4de25e4a7ae719b71a8778bda06eea4de7899ceadb873e4dc3c91ac0885a2b69ad54442c094474dfe8bf2647219f1ccdfec19508c"

RPROVIDES:${PN} += "udpspeeder \
udpspeeder(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
