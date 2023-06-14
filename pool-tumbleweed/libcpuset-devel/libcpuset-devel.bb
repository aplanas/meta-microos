SUMMARY = "cpuset processor and memory placement library"
DESCRIPTION = "The Cpuset System is a processor and memory placement mechanism that \
enables a system administrator to confine tasks to running certain \
CPUs, and to allocating memory on certain Memory Nodes.  The libcpuset \
library provides a convenient 'C' API to cpusets."
LICENSE = "LGPL-2.1+"

PV = "1.0"

RPM_NAME = "libcpuset-devel-1.0-36.25.aarch64.rpm"
RPM_HASH = "71600be0bd46005a2383a2779b3acb5dac709a2b533c8c033da6a4205080e85584519947d484f40db06354f514b8c0dd556aa481d0b05ee5a6e30edfe84fb41c"

RPROVIDES:${PN} += "libcpuset-devel"

RDEPENDS:${PN} += "glibc-devel \
libcpuset1"

inherit rpm
