SUMMARY = "Bandwidth Monitor and Rate Estimator"
DESCRIPTION = "bmon is a portable bandwidth monitor and rate estimator. It supports various \
input methods for different architectures. Various output modes exist, \
including an interactive curses interface, lightweight HTML output, and simple \
ASCII output. Statistics may be distributed over a network using multicast or \
unicast and collected at some point to generate a summary of statistics for a \
set of nodes."
LICENSE = "MIT | BSD-2-Clause"

PV = "4.0"

RPM_NAME = "bmon-4.0-1.25.aarch64.rpm"
RPM_HASH = "4e11ef28b7f08a4af449f337e8d3ca27359eec9bf318b6000253ec8b086eccee6ef1fef26c4ea0184d9da598bd64dca57b65fd61daef582aa36eb3a00795c5a2"

RPROVIDES:${PN} += "bmon \
config-bmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libm.so.6 \
libncursesw.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libtinfo.so.6"

inherit rpm
