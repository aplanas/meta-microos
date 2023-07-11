SUMMARY = "The KBD plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to kernel block devices, namely zRAM and \
Bcache."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_kbd2-2.28-1.6.aarch64.rpm"
RPM_HASH = "40711e784af3d2d316e1fb7c41861042fc2dc68e58c300de76afa04f655ef302c3f4b133a8a2e606e3432b2db64dc760eebd2880c6c42a4f9e0f439f9ca18a5c"

RPROVIDES:${PN} += "libbd-kbd.so.2 \
libbd-kbd2 \
libblockdev-kbd"

RDEPENDS:${PN} += "/sbin/ldconfig \
bcache-tools \
ld-linux-aarch64.so.1 \
libbd-utils.so.2 \
libbd-utils2 \
libbytesize.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
