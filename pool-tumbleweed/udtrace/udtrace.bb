SUMMARY = "Unix domain socket tracing"
DESCRIPTION = "This is a LD_PRELOAD wrapper library which can be used to trace the \
data sent and/or received via unix domain sockets. \
 \
Unlike IP based communication that can be captured/traced with pcap \
programs like tcpdump or wireshark, there is no similar mechanism \
available for unix domain sockets. \
 \
This LD_PRELOAD library intercepts the C library function calls of \
dynamically linked programs. It will detect all file descriptors \
representing unix domain sockets and will then print traces of all \
data sent/received via the socket."
LICENSE = "GPL-3.0"

PV = "0.0.0+git.20180402"

RPM_NAME = "udtrace-0.0.0+git.20180402-1.15.aarch64.rpm"
RPM_HASH = "d3ec81e99ae284b2e2d207988092494c157fbf86a63c261cfa46af46eac5a1aea4003595babe7cf4ba48b54b423f5824ca64c86143d171fd6990c6ec84540a97"

RPROVIDES:${PN} += "libudtrace.so()(64bit) \
udtrace \
udtrace(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
