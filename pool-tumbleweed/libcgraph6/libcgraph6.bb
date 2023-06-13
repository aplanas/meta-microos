SUMMARY = "Library for graph programming"
DESCRIPTION = "Libcgraph supports graph programming by maintaining graphs in memory and \
reading and writing graph files. Graphs are composed of nodes, edges, and \
nested subgraphs. These graph objects may be attributed with string \
name-value pairs and programmer-defined records."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "libcgraph6-2.49.3-6.3.aarch64.rpm"
RPM_HASH = "ae70791cdfdb19886dced3ad94d6e514b28b41f1b2e5880c7bb50e150693fda373364819f8743cb038de9b362ad7642becc7228c0e5eab01db3801fbbd7849be"

RPROVIDES:${PN} += "libcgraph.so.6()(64bit) \
libcgraph6 \
libcgraph6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcdt.so.5()(64bit)"

inherit rpm
