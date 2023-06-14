SUMMARY = "Tool to benchmark interactivity in Linux"
DESCRIPTION = "This benchmark application is designed to benchmark interactivity in Linux. See \
the included file readme.interactivity for a brief definition. \
 \
It is designed to measure the effect of changes in Linux kernel design or system \
configuration changes such as cpu, I/O scheduler and filesystem changes and \
options. With careful benchmarking, different hardware can be compared."
LICENSE = "GPL-2.0-only"

PV = "0.31"

RPM_NAME = "interbench-0.31-3.9.aarch64.rpm"
RPM_HASH = "2fd07ce7a337267026929b338cfd4368d53e93b8df09c35cce78b8f6dd5b1248be1fb769f655b94a60aa051976b9568c7dfdde20fcc4b426f1f712ae8c0f019c"

RPROVIDES:${PN} += "interbench"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
