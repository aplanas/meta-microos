SUMMARY = "Web server applicatin workload generator"
DESCRIPTION = "ebizzy is designed to generate a workload resembling common web application \
server workloads. It is highly threaded, has a large in-memory working set, and \
allocates and deallocates memory frequently."
LICENSE = "GPL-2.0"

PV = "0.3"

RPM_NAME = "ebizzy-0.3-1.26.aarch64.rpm"
RPM_HASH = "842968ef76a0d6498b6bbef18b9c1e70144dc57e6523d45620f6aae418d9eabaa750f9801a34561c4ef596c233502aa072aee515ddd1c83b6592145aa283a616"

RPROVIDES:${PN} += "ebizzy \
ebizzy(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
