SUMMARY = "Linux-native io_uring I/O access library"
DESCRIPTION = "Provides native async IO for the Linux kernel, in a fast and efficient \
manner, for both buffered and O_DIRECT."
LICENSE = "(GPL-2.0-only & LGPL-2.1-or-later) | MIT"

PV = "2.3"

RPM_NAME = "liburing2-2.3-3.1.aarch64.rpm"
RPM_HASH = "abee5631607d0bbcd0f9991252568068d32588d92338f31bcad46f9de49ea1667038e2d70cb1be18958d958675f98d621c759e33717c51d25b013183731b17bf"

RPROVIDES:${PN} += "liburing.so.2 \
liburing2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
