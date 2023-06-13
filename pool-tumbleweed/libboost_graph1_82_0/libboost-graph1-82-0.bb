SUMMARY = "Boost.Graph runtime library"
DESCRIPTION = "This package contains the Boost.Graph runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_graph1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "1a26553be9caa688353ce420824fd8b1f9676954938c57ed1eb1dcfdf7835c9e898a0f2b889f6f0fd9fb1060460e57708da6f359e8aed9ac804d47f258cc4f85"

RPROVIDES:${PN} += "libboost_graph.so.1.82.0()(64bit) \
libboost_graph1_82_0 \
libboost_graph1_82_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
