SUMMARY = "A tool to measure network performance"
DESCRIPTION = "Iperf is a tool for active measurements of the maximum achievable bandwidth \
on IP networks. It supports tuning of various parameters related to timing, \
protocols, and buffers. For each test it reports the bandwidth, loss, and \
other parameters. \
 \
This package contains development files."
LICENSE = "BSD-3-Clause"

PV = "3.14"

RPM_NAME = "iperf-devel-3.14-1.1.aarch64.rpm"
RPM_HASH = "cacb55ddf00dc7a6702c045248459271282cd6a1f7a62b5df87d9147a79d2f1cf0810531ef856c192f58138f91ae48478225d82415e20d60ab7bfb00ca398d7a"

RPROVIDES:${PN} += "iperf-devel"

RDEPENDS:${PN} += "libiperf0 \
pkgconfig-uuid"

inherit rpm
