SUMMARY = "System status information library"
DESCRIPTION = "A library that fetches information about the running system, such as \
CPU and memory usage and active processes. \
 \
On Linux systems, this information is taken directly from the /proc \
file system. On other systems, a server is used to read information \
from /dev/kmem."
LICENSE = "GPL-2.0-or-later"

PV = "2.40.0"

RPM_NAME = "libgtop-2_0-11-2.40.0-4.3.aarch64.rpm"
RPM_HASH = "8ef7d06a057162c03f4b9f7873a972874322bb76671e8afeddc68d2090e7d6cc3a408d7159715ee96edee91224a249d5b3edba7390ce75b2311dd8956c14c1df"

RPROVIDES:${PN} += "libgtop \
libgtop-2.0.so.11()(64bit) \
libgtop-2_0-11 \
libgtop-2_0-11(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libXau.so.6()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
