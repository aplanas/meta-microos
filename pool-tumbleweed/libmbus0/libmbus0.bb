SUMMARY = "M-bus Library"
DESCRIPTION = "libmbus is an open source library for the M-bus (Meter-Bus) protocol. \
 \
The Meter-Bus is a standard for reading out meter data from electricity meters, heat meters, gas meters, etc. The M-bus standard deals with both the electrical signals on the M-Bus, and the protocol and data format used in transmissions on the M-Bus. The role of libmbus is to decode/encode M-bus data, and to handle the communication with M-Bus devices."
LICENSE = "BSD-3-Clause"

PV = "0.9.0+59"

RPM_NAME = "libmbus0-0.9.0+59-1.3.aarch64.rpm"
RPM_HASH = "b0301374b3bfc45a4324649af7dfec87e954f4ea77b5d3d1626ccc27ca90d3f8c3a13c58d145c35a5fa5927605364537c4598a2b35911aa81b1e5fecd57d138e"

RPROVIDES:${PN} += "libmbus.so.0()(64bit) \
libmbus0 \
libmbus0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
