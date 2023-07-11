SUMMARY = "Clock and Network Simulator"
DESCRIPTION = "clknetsim is a tool designed to test programs which synchronize the system \
clock, either over network or from a hardware reference clock. It simulates \
a system or a number of systems connected to each other in a network and \
the tested programs discipline the simulated system clocks. It can be used \
to quickly test how well the programs control the system clocks in various \
conditions or to test the network protocols."
LICENSE = "GPL-2.0-only"

PV = "0+git.20230612"

RPM_NAME = "clknetsim-0+git.20230612-1.1.aarch64.rpm"
RPM_HASH = "a5cd604209d67fd8517f93d99899cc554b2424e54fc6620aa6d9b2ddfad339c54865daa731357599f58478d862e715266369a0735422bea69466a03594124ff1"

RPROVIDES:${PN} += "clknetsim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
