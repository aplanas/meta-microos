SUMMARY = "A Firewire Interface library"
DESCRIPTION = "libraw1394 provides direct access to the connected 1394 buses to \
userspace. Through this library, applications can directly send to \
and receive from other nodes without requiring a kernel driver for \
the protocol in question. \
 \
libraw1394 abstracts the interface that is used to communicate with \
the kernel. It works with both the Juju stack (firewire-core.ko; \
/dev/fw*; present since Linux kernel 2.6.22) and the old Linux1394 \
(raw1394.ko; /dev/raw1394; present until 2.6.36)."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "libraw1394-11-2.1.2-1.12.aarch64.rpm"
RPM_HASH = "b2f2aa871744bab0fa03b5e4ba36afef3b55f4b6464771d97b896ffa2dd31a83d4f7e1d22c1e32d0fa06475756c054327a0f3159f13fa329fdfaeef8d2c885e9"

RPROVIDES:${PN} += "libraw1394-11 \
libraw1394.so.11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
