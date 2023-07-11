SUMMARY = "System status information library"
DESCRIPTION = "A library that fetches information about the running system, such as \
CPU and memory usage and active processes. \
 \
On Linux systems, this information is taken directly from the /proc \
file system. On other systems, a server is used to read information \
from /dev/kmem."
LICENSE = "GPL-2.0-or-later"

PV = "2.40.0"

RPM_NAME = "libgtop-2.40.0-4.4.aarch64.rpm"
RPM_HASH = "1e957b055d7ce6eeaac8e5dee189b9686d70592139b7a8889ad8c20d8d5fa8c3784c39a417f39fd6fdd7c847ceeec862dfcb4c5a7e8cc6950f25bf600cb29e38"

RPROVIDES:${PN} += "libgtop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXau.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libgtop-2.0.so.11"

inherit rpm
