SUMMARY = "Network performance measurement"
DESCRIPTION = "Flowgrind is a tool similar to iperf, netperf to measure throughput and other \
metrics for TCP and other protocols. It features some unique characteristics \
which are of use when exploring the idiosyncrasies of wireless mesh networks."
LICENSE = "GPL-2.0-only"

PV = "0.8.2"

RPM_NAME = "flowgrind-0.8.2-1.3.aarch64.rpm"
RPM_HASH = "e373b6809a4bf136fd43af788bf3de148c533e8e4caa99d720c4fa73650f4bbeb9b4ffe853cae0e997389050c0d7e9093e651d015416984b17a13c1bf09cfa40"

RPROVIDES:${PN} += "flowgrind"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libpcap.so.1 \
libuuid.so.1 \
libxmlrpc-client.so.3 \
libxmlrpc-server-abyss.so.3 \
libxmlrpc-server.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
