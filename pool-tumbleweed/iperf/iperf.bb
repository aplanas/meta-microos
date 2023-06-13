SUMMARY = "A tool to measure network performance"
DESCRIPTION = "Iperf is a tool for active measurements of the maximum achievable bandwidth \
on IP networks. It supports tuning of various parameters related to timing, \
protocols, and buffers. For each test it reports the bandwidth, loss, and \
other parameters. \
 \
This version, sometimes referred to as iperf3, is a redesign of an original \
version developed at NLANR/DAST. iperf3 is a new implementation from scratch, \
with the goal of a smaller, simpler code base, and a library version of the \
functionality that can be used in other programs. iperf3 also a number of \
features found in other tools such as nuttcp and netperf, but were missing \
from the original iperf. These include, for example, a zero-copy mode and \
optional JSON output. \
 \
Note that iperf3 is NOT backwards compatible with the original iperf."
LICENSE = "BSD-3-Clause"

PV = "3.13"

RPM_NAME = "iperf-3.13-1.2.aarch64.rpm"
RPM_HASH = "6d75438e208cc1893518db474583a91513a9b5121a4cf077cc848977cd2133fc3ba30e78608b00d5bdf444d0c55a1757f1edc2a086fe251ce9346c09473fe60a"

RPROVIDES:${PN} += "iperf \
iperf(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libiperf.so.0()(64bit) \
libiperf0"

inherit rpm
