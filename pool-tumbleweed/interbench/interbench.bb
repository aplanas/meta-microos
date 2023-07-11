SUMMARY = "Tool to benchmark interactivity in Linux"
DESCRIPTION = "This benchmark application is designed to benchmark interactivity in Linux. See \
the included file readme.interactivity for a brief definition. \
 \
It is designed to measure the effect of changes in Linux kernel design or system \
configuration changes such as cpu, I/O scheduler and filesystem changes and \
options. With careful benchmarking, different hardware can be compared."
LICENSE = "GPL-2.0-only"

PV = "0.31"

RPM_NAME = "interbench-0.31-3.10.aarch64.rpm"
RPM_HASH = "7602a431e86a839dca3c55b9f83ff7279d8d11bd9ae7b51cf6696ffe423768d30e07dda1c03df676cb3330f814dcccfcd7dffcc3b0c9f885bc6e1a2653bd3c82"

RPROVIDES:${PN} += "interbench"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
