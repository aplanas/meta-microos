SUMMARY = "Network performance meter for the UDP, TCP, SCTP and DCCP protocols"
DESCRIPTION = "NetPerfMeter is a network performance meter for the UDP, TCP, SCTP \
and DCCP transport protocols over IPv4 and IPv6. It simultaneously \
transmits bidirectional flows to an endpoint and measures the \
resulting flow bandwidths and QoS. The results are written as \
vector and scalar files. \
The vector files can e.g. be used to create plots of the results."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0"

RPM_NAME = "netperfmeter-1.9.0-1.9.aarch64.rpm"
RPM_HASH = "83341d775b06896ddf165c8b0f4b9d183522d7bc3fe666c9e7adab85adb9fc7b8ad0de1d8d0b5109a59ad91fe120e79f4acf98e0db6083d94bc884141a784ace"

RPROVIDES:${PN} += "netperfmeter"

RDEPENDS:${PN} += "libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsctp.so.1 \
libstdc++.so.6"

inherit rpm
