SUMMARY = "System status information library"
DESCRIPTION = "A library that fetches information about the running system, such as \
CPU and memory usage and active processes. \
 \
On Linux systems, this information is taken directly from the /proc \
file system. On other systems, a server is used to read information \
from /dev/kmem."
LICENSE = "GPL-2.0-or-later"

PV = "2.40.0"

RPM_NAME = "libgtop-2_0-11-2.40.0-4.4.aarch64.rpm"
RPM_HASH = "114c3f341602f9b13b6839e1a79f7b99e80590d1b5700bae17ada0bc75277a0b0dfa8599d17efaf7e13a4b043087825f3e6cf26974c17e0eb9066d690457e5ba"

RPROVIDES:${PN} += "libgtop \
libgtop-2-0-11 \
libgtop-2.0.so.11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXau.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
