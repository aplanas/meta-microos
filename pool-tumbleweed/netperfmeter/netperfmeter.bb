SUMMARY = "Network performance meter for the UDP, TCP, SCTP and DCCP protocols"
DESCRIPTION = "NetPerfMeter is a network performance meter for the UDP, TCP, SCTP \
and DCCP transport protocols over IPv4 and IPv6. It simultaneously \
transmits bidirectional flows to an endpoint and measures the \
resulting flow bandwidths and QoS. The results are written as \
vector and scalar files. \
The vector files can e.g. be used to create plots of the results."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.4"

RPM_NAME = "netperfmeter-1.9.4-1.1.aarch64.rpm"
RPM_HASH = "802e9cdbc5ba26369becd27c35f1db580bd5cabf37045e2e9018786f438aef2f26c24542ab7cf999a23a3df69d9345b530743d2e9d096c4bf91d2c89ec75b0b9"

RPROVIDES:${PN} += "netperfmeter"

RDEPENDS:${PN} += "libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsctp.so.1 \
libstdc++.so.6"

inherit rpm
