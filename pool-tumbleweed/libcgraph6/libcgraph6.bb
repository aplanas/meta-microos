SUMMARY = "Library for graph programming"
DESCRIPTION = "Libcgraph supports graph programming by maintaining graphs in memory and \
reading and writing graph files. Graphs are composed of nodes, edges, and \
nested subgraphs. These graph objects may be attributed with string \
name-value pairs and programmer-defined records."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "libcgraph6-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "7b29b3ea63101d4f16ffdbc8b629a17ee3aefae14ec5fe4d6ff18852f88cb2a47aeffa853992ccef355bc669f2d009ad00eb0b8867f2fb820c6ca7b0525561f8"

RPROVIDES:${PN} += "libcgraph.so.6 \
libcgraph6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdt.so.5"

inherit rpm
