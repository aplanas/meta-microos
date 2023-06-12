SUMMARY = "System status information library"
DESCRIPTION = "A library that fetches information about the running system, such as \
CPU and memory usage and active processes. \
 \
On Linux systems, this information is taken directly from the /proc \
file system. On other systems, a server is used to read information \
from /dev/kmem."
LICENSE = "GPL-2.0-or-later"

PV = "2.40.0"

RPM_NAME = "libgtop-2.40.0-4.3.aarch64.rpm"
RPM_HASH = "9da6bfd8f97810f163054cbb7ce197f3c93fe780b0439b324b458815456152795d73fd088cc07e6a0c5d94d8ac0ac9221ea280b80068f42a55bca5948d61e8a9"

RPROVIDES:${PN} += "libgtop \
libgtop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libXau.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgtop-2.0.so.11()(64bit)"

inherit rpm
