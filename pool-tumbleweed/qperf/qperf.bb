SUMMARY = "Tool to measure socket and RDMA performance"
DESCRIPTION = "qperf measures bandwidth and latency between two nodes. It can work \
over TCP/IP as well as the RDMA transports."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "0.4.11"

RPM_NAME = "qperf-0.4.11-1.11.aarch64.rpm"
RPM_HASH = "1f0b18bd6f1a51f453f5726d1ddd7f966982591df7e31a07c234e564907c3f6d640d86aff8a466cc5198e395c38dd77bb8182b7f70553ada6e1ab954f31b1fc8"

RPROVIDES:${PN} += "qperf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
librdmacm.so.1"

inherit rpm
