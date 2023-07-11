SUMMARY = "Utility for task distribution over networks or CPUs"
DESCRIPTION = "A program that processes a list of tasks in parallel \
on different CPUs, computers in a network or whatever else."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "paexec-1.1.4-2.10.aarch64.rpm"
RPM_HASH = "d38e68f08a7335e2169e3a772fb3ff96a4a0e4e8979e7784458b5a0b9bc4d408c6da34e7172b291fbf85edd82880e2678838dde5fcaaaf5ac04a72668654b65d"

RPROVIDES:${PN} += "paexec"

RDEPENDS:${PN} += "/usr/bin/runawk \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmaa.so.4 \
runawk"

inherit rpm
