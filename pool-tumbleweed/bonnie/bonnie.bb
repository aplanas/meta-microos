SUMMARY = "File System Benchmark"
DESCRIPTION = "Bonnie is a popular performance benchmark that targets various aspects \
of Unix file systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "bonnie-1.6-1.13.aarch64.rpm"
RPM_HASH = "6412442e7d893af40e5cf5bc48953ce1c4f84b3d08e93fbf2dc80d260d04b997de67388f8a79d3c4bc40a6c190ead2c736b371f7ab1666dda28ac468b7f64cdf"

RPROVIDES:${PN} += "bonnie \
bonnie(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
