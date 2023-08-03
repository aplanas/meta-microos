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

PV = "3.14"

RPM_NAME = "iperf-3.14-1.1.aarch64.rpm"
RPM_HASH = "03cfa04028a46fce016a3fbd28c09cf82e949f39c5e6866bb4b0a59a5868364e17ff65a7b3ddaa1957d06f8c36e2cad404d657af0500668f4ef1964e8fb3a587"

RPROVIDES:${PN} += "iperf"

RDEPENDS:${PN} += "libc.so.6 \
libiperf.so.0 \
libiperf0"

inherit rpm
