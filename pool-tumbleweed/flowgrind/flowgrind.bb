SUMMARY = "Network performance measurement"
DESCRIPTION = "Flowgrind is a tool similar to iperf, netperf to measure throughput and other \
metrics for TCP and other protocols. It features some unique characteristics \
which are of use when exploring the idiosyncrasies of wireless mesh networks."
LICENSE = "GPL-2.0-only"

PV = "0.8.2"

RPM_NAME = "flowgrind-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "5d390b8d64559003a7e4413335453a8afd098cade9b24517313988baa26f3c997663d0cfef3f6134c991086c1b242082ec9bab1509d8b9e19118b602af566920"

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
