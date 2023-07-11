SUMMARY = "Linux-native io_uring I/O access library"
DESCRIPTION = "Provides native async IO for the Linux kernel, in a fast and efficient \
manner, for both buffered and O_DIRECT."
LICENSE = "(GPL-2.0-only & LGPL-2.1-or-later) | MIT"

PV = "2.4"

RPM_NAME = "liburing2-2.4-1.1.aarch64.rpm"
RPM_HASH = "6ed06190631dcf6b6060158bcd7b20f504e333c6df7d370aa6b9b4bbb009af4997f8b4d99febd4da4be03c36a1f8d8c2dc2682a9b088815bc4790c78abc4c85b"

RPROVIDES:${PN} += "liburing.so.2 \
liburing2"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
